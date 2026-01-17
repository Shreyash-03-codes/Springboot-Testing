package com.springboot.posting.socials.entity;

import com.springboot.posting.socials.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String username;

    private String password;

    private String email;

    private String phone;

    @OneToMany(mappedBy = "user",orphanRemoval = true,cascade = CascadeType.ALL)
    private Set<Post> posts;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private Set<Role> roles;

    @Embedded
    private Address address;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Set<SimpleGrantedAuthority> authorities=new HashSet<>();
        roles.forEach(role->{
                    authorities.add(new SimpleGrantedAuthority("ROLE_"+role.name()));
                    role.getPermissions()
                            .forEach(permissions -> {
                                authorities.add(new SimpleGrantedAuthority(permissions.name()));
                            });
                }
        );

        return authorities;
    }
}
