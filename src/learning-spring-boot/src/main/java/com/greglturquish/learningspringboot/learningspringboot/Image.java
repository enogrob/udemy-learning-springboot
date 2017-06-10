package com.greglturquish.learningspringboot.learningspringboot;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * Created by enogrob on 10/06/17.
 */
@Entity @GeneratedValue
public class Image {

    @Id
    private Long id;
    private String name;
    private Image() {}

    public Image(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
