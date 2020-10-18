package com.dca.pmanager.documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User extends Base {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {

    }

}
