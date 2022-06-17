package me.cpoulsen.poc.entities;

import me.cpoulsen.poc.core.models.CreatePerson;
import me.cpoulsen.poc.core.models.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public PersonEntity(CreatePerson create) {
        this.name = create.getName();
    }

    public PersonEntity() { }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person toPerson() {
        return new Person(id, name);
    }
}
