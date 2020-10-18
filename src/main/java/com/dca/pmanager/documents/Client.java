package com.dca.pmanager.documents;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {
    private String id;
    private String name;
    private String description;

    private List<Project> projects;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Client(String id, String name, String description, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projects = projects;
    }

    
}
