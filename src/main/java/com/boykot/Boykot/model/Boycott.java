package com.boykot.Boykot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boycott {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String boycotted;
    private String reason;
    private String byWhom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoycotted() {
        return boycotted;
    }

    public void setBoycotted(String boycotted) {
        this.boycotted = boycotted;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getByWhom() {
        return byWhom;
    }

    public void setByWhom(String byWhom) {
        this.byWhom = byWhom;
    }
}
