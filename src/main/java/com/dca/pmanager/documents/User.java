package com.dca.pmanager.documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

    
}
