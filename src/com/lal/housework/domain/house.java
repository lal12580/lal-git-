package com.lal.housework.domain;

public class house {
    private int id;
    private String name;
    private  String tele;
    private String site;
    private int rent;
    private String status;

    public house(int id, String name, String tele, String site, int rent, String status) {
        this.id = id;
        this.name = name;
        this.tele = tele;
        this.site = site;
        this.rent = rent;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  id +
                "\t\t" +name+
                "\t\t" + tele +
                "\t\t" + site +
                "\t\t" + rent +
                "\t\t" + status ;
    }
}


