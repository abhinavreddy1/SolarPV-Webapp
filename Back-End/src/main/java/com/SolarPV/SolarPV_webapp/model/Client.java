package com.SolarPV.SolarPV_webapp.model;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String cname;
    private String clientype;

    @OneToOne(mappedBy = "client")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @OneToOne(mappedBy = "client")
    private Location location;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getClientype() {
        return clientype;
    }

    public void setClientype(String clientype) {
        this.clientype = clientype;
    }
}
