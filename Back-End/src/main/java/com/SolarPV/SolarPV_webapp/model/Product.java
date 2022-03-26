package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String pname;
    private String celtech;
    private String celmanu;
    private int celnum;
    private int sercelnum;
    private int serstrnum;
    private int diodenum;
    private int plength;
    private int pwidth;
    private int pweight;
    private String suptype;
    private String supmanu;
    private String subtype;
    private String submanu;
    private String frametype;
    private String fadh;
    private String entype;
    private String enmanu;
    private String jboxtype;
    private String jboxmanu;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    @OneToOne(mappedBy = "product")
    private Certificate certificate;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCeltech() {
        return celtech;
    }

    public void setCeltech(String celtech) {
        this.celtech = celtech;
    }

    public String getCelmanu() {
        return celmanu;
    }

    public void setCelmanu(String celmanu) {
        this.celmanu = celmanu;
    }

    public int getCelnum() {
        return celnum;
    }

    public void setCelnum(int celnum) {
        this.celnum = celnum;
    }

    public int getSercelnum() {
        return sercelnum;
    }

    public void setSercelnum(int sercelnum) {
        this.sercelnum = sercelnum;
    }

    public int getSerstrnum() {
        return serstrnum;
    }

    public void setSerstrnum(int serstrnum) {
        this.serstrnum = serstrnum;
    }

    public int getDiodenum() {
        return diodenum;
    }

    public void setDiodenum(int diodenum) {
        this.diodenum = diodenum;
    }

    public int getPlength() {
        return plength;
    }

    public void setPlength(int plength) {
        this.plength = plength;
    }

    public int getPwidth() {
        return pwidth;
    }

    public void setPwidth(int pwidth) {
        this.pwidth = pwidth;
    }

    public int getPweight() {
        return pweight;
    }

    public void setPweight(int pweight) {
        this.pweight = pweight;
    }

    public String getSuptype() {
        return suptype;
    }

    public void setSuptype(String suptype) {
        this.suptype = suptype;
    }

    public String getSupmanu() {
        return supmanu;
    }

    public void setSupmanu(String supmanu) {
        this.supmanu = supmanu;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getSubmanu() {
        return submanu;
    }

    public void setSubmanu(String submanu) {
        this.submanu = submanu;
    }

    public String getFrametype() {
        return frametype;
    }

    public void setFrametype(String frametype) {
        this.frametype = frametype;
    }

    public String getFadh() {
        return fadh;
    }

    public void setFadh(String fadh) {
        this.fadh = fadh;
    }

    public String getEntype() {
        return entype;
    }

    public void setEntype(String entype) {
        this.entype = entype;
    }

    public String getEnmanu() {
        return enmanu;
    }

    public void setEnmanu(String enmanu) {
        this.enmanu = enmanu;
    }

    public String getJboxtype() {
        return jboxtype;
    }

    public void setJboxtype(String jboxtype) {
        this.jboxtype = jboxtype;
    }

    public String getJboxmanu() {
        return jboxmanu;
    }

    public void setJboxmanu(String jboxmanu) {
        this.jboxmanu = jboxmanu;
    }
}
