package me.cpoulsen.poc.core.services.abstraction;

import me.cpoulsen.poc.core.models.CreatePerson;
import me.cpoulsen.poc.core.models.Person;

public interface PersonService {
    Person createPerson(CreatePerson createPerson);

    Person findById(Long id);
}
