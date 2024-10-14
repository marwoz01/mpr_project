package pl.edu.pjatk.MPR_2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // <- 1.
public class Capybara {
    @Id // <- 2.
    @GeneratedValue(strategy = GenerationType.AUTO) // <-3.
    private Long id;
    private String name;
    private String color;

    public Capybara(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Capybara() { // <-5.

    }

    public Long getId() { // <-4.
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
