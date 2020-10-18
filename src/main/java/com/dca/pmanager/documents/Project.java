package com.dca.pmanager.documents;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Project {
    private String id;
    private String name;
    private String description;
    private Client client;
    private int fixedHours;
    private int paidHours;
    private int workedHours;
    private double hourlyRate;

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getFixedHours() {
        return fixedHours;
    }

    public void setFixedHours(int fixedHours) {
        this.fixedHours = fixedHours;
    }

    public int getPaidHours() {
        return paidHours;
    }

    public void setPaidHours(int paidHours) {
        this.paidHours = paidHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Project(String id, String name, String description, Client client, int fixedHours, int paidHours,
            int workedHours, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.client = client;
        this.fixedHours = fixedHours;
        this.paidHours = paidHours;
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

}
