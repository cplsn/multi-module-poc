package me.cpoulsen.poc.services;

import me.cpoulsen.poc.entities.PersonEntity;
import me.cpoulsen.poc.exception.NotFoundException;
import me.cpoulsen.poc.core.models.CreatePerson;
import me.cpoulsen.poc.core.models.Person;
import me.cpoulsen.poc.repositories.PersonRepository;
import org.springframework.stereotype.Service;
import me.cpoulsen.poc.core.services.abstraction.PersonService;

@Service
public class PersonInternalService implements PersonService {

    private final PersonRepository repository;

    public PersonInternalService(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person createPerson(CreatePerson createPerson) {
        var toSave = new PersonEntity(createPerson);
        return repository
                .save(toSave)
                .toPerson();
    }

    @Override
    public Person findById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new)
                .toPerson();
    }
}
