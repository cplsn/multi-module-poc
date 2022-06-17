package me.cpoulsen.poc.infra.config.controllers;

import me.cpoulsen.poc.infra.controllers.PersonController;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import me.cpoulsen.poc.core.services.abstraction.PersonService;

@Configuration
@AutoConfigureAfter(PersonService.class)
public class PersonControllerConfig {

    @Bean
    @ConditionalOnMissingBean
    PersonController personController(PersonService service) {
        return new PersonController(service);
    }
}
