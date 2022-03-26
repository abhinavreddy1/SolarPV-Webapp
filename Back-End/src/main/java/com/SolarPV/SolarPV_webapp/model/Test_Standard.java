package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Test_Standard {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String staname;
    private String description;
    private Date publishedDate;

    @OneToOne(mappedBy = "standard")
    private Service_Solar service;

    @OneToOne(mappedBy = "standard")
    private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Service_Solar getService() {
        return service;
    }

    public void setService(Service_Solar service) {
        this.service = service;
    }

    public Test_Standard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
