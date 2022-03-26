package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;

@Entity
public class Test_Sequence {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String seqname;

    public Performance_Data getPerformance() {
        return performance;
    }

    public void setPerformance(Performance_Data performance) {
        this.performance = performance;
    }

    @OneToOne(mappedBy = "sequence")
    private Performance_Data performance;

    public Test_Sequence() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeqname() {
        return seqname;
    }

    public void setSeqname(String seqname) {
        this.seqname = seqname;
    }
}
