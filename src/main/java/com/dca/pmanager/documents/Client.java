package com.dca.pmanager.documents;

import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client extends Base {

    private String name;
    private String description;

    private List<Project> projects;

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

    public Client() {
    }

}
