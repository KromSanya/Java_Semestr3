package org.example;

import java.util.Objects;

/**
 * Дисциплина
 */
public class Subject {
    private long id;
    private String name;

    public Subject(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject subject)) return false;
        return id == subject.id && name.equals(subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

