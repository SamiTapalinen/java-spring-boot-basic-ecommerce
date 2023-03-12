package com.samitapalinen.ecommerce.model;

public class User {
    private int id;

    private String name;

    private static int count = 0;

    public User()
    {
        this(null);
    }

    public User(String name) {
        this.name = name;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
