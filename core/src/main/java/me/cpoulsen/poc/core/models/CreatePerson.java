package me.cpoulsen.poc.core.models;

public class CreatePerson {
    private String name;

    public CreatePerson(String name) {
        this.name = name;
    }

    public CreatePerson() { }

    public String getName() {
        return name;
    }

    public String setName() { return name; }
}
