package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;

@Entity
public class Service_Solar {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private int id;
    private String sername;
    private String description;
    private String FIbool;
    private String FIfreq;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Standard_ID",referencedColumnName = "id")
    private Test_Standard standard;

    public Test_Standard getStandard() {
        return standard;
    }

    public void setStandard(Test_Standard standard) {
        this.standard = standard;
    }

    public Service_Solar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFIbool() {
        return FIbool;
    }

    public void setFIbool(String FIbool) {
        this.FIbool = FIbool;
    }

    public String getFIfreq() {
        return FIfreq;
    }

    public void setFIfreq(String FIfreq) {
        this.FIfreq = FIfreq;
    }
}
