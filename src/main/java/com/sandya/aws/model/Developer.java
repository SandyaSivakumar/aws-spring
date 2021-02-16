package com.sandya.aws.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test-db")
public class Developer {

    @Id
    private int id;

    private String name;
    private String cecid;
    private String task;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCecid() {
        return cecid;
    }

    public void setCecid(String cecid) {
        this.cecid = cecid;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
