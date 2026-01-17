package com.springboot.posting.socials.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
@Getter
public enum Role {
    ADMIN(Set.of(Permissions.POST_READ,Permissions.POST_DELETE,Permissions.POST_UPDATE,Permissions.POST_CREATE,Permissions.USER_READ,Permissions.USER_DELETE,Permissions.USER_UPDATE,Permissions.USER_CREATE)),
    USER(Set.of(Permissions.POST_READ,Permissions.POST_DELETE,Permissions.POST_UPDATE,Permissions.POST_CREATE));

    private final Set<Permissions> permissions;
}
