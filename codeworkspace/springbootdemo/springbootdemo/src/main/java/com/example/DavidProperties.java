package com.example;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by wei on 2017/5/2 0002.
 */
public class DavidProperties {

    @Value("$com.example.title")
    private String title;
    @Value("$com.example.description")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
