package me.cpoulsen.poc.core.models;

public class Person  {
    private final Long id;
    private final String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
