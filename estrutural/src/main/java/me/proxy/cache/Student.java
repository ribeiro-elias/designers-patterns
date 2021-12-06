package me.proxy.cache;

public class Student {
    private Long id;
    private String name;

    public Student(String name,Long id) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
