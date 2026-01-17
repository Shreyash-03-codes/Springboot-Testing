package com.springboot.posting.socials.config;

import com.springboot.posting.socials.service.auditoraware.AuditOrAwareImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public AuditOrAwareImpl auditOrAware(){
        return new AuditOrAwareImpl();
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
