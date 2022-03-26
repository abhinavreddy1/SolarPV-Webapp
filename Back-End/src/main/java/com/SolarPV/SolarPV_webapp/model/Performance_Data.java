package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;

@Entity
public class Performance_Data {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String maxsysvolt;
    private String voc;
    private String isc;
    private String vmp;
    private String imp;
    private String pmp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Test_Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Test_Sequence sequence) {
        this.sequence = sequence;
    }

    private String ff;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Sequence_ID",referencedColumnName = "id")
    private Test_Sequence sequence;

    public Performance_Data() {
    }

    public String getMaxsysvolt() {
        return maxsysvolt;
    }

    public void setMaxsysvolt(String maxsysvolt) {
        this.maxsysvolt = maxsysvolt;
    }

    public String getVoc() {
        return voc;
    }

    public void setVoc(String voc) {
        this.voc = voc;
    }

    public String getIsc() {
        return isc;
    }

    public void setIsc(String isc) {
        this.isc = isc;
    }

    public String getVmp() {
        return vmp;
    }

    public void setVmp(String vmp) {
        this.vmp = vmp;
    }

    public String getImp() {
        return imp;
    }

    public void setImp(String imp) {
        this.imp = imp;
    }

    public String getPmp() {
        return pmp;
    }

    public void setPmp(String pmp) {
        this.pmp = pmp;
    }

    public String getFf() {
        return ff;
    }

    public void setFf(String ff) {
        this.ff = ff;
    }
}
