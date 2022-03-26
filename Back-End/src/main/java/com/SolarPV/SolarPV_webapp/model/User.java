package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "First_Name")
    private String fname;
    @Column(name = "Last_Name")
    private String lname;
    @Column(name = "Middle_Name")
    private String mname;
    @Column(name = "Job_Title")
    private String jobtitle;
    @Column(name = "EMail")
    private String email;
    @Column(name = "Office_Phone")
    private String ophone;
    @Column(name = "Mobile_Phone")
    private String mphone;
    @Column(name = "Prefix")
    private String prefix;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Client_ID",referencedColumnName = "id")
    private Client client;

    @OneToOne(mappedBy = "user")
    private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
