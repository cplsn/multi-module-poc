package me.cpoulsen.poc.infra.controllers;

import me.cpoulsen.poc.core.models.CreatePerson;
import me.cpoulsen.poc.core.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import me.cpoulsen.poc.core.services.abstraction.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    Person create(@RequestBody CreatePerson createPerson) {
        return service.createPerson(createPerson);
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    Person getById(@PathVariable Long id) {
        return service.findById(id);
    }
}
