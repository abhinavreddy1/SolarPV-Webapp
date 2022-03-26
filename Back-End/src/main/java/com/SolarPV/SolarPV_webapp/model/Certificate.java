package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Certificate {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private  int CID;
    private int reportnum;
    private Date issuedate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="User_ID",referencedColumnName = "id")
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Standard_ID",referencedColumnName = "id")
    private Test_Standard standard;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Location_ID",referencedColumnName = "id")
    private Location location;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Product_ID",referencedColumnName = "id")
    private Product product;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Test_Standard getStandard() {
        return standard;
    }

    public void setStandard(Test_Standard standard) {
        this.standard = standard;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Certificate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public int getReportnum() {
        return reportnum;
    }

    public void setReportnum(int reportnum) {
        this.reportnum = reportnum;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }
}
