package com.engeto.ja.du;

import java.math.BigDecimal;

public class Room {
    private int noOfRoom;
    private String beds;
    private String balcony;
    private String seaViews;
    private int priceForNight;

    public Room(int noOfRoom, String beds, String balcony, String seaViews, int priceForNight) {
        this.noOfRoom = noOfRoom;
        this.beds = beds;
        this.balcony = balcony;
        this.seaViews = seaViews;
        this.priceForNight = priceForNight;
    }

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public String getNoOfBeds() {
        return beds;
    }

    public void setNoOfBeds(String noOfBeds) {
        this.beds = noOfBeds;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public String getSeaViews() {
        return seaViews;
    }

    public void setSeaViews(String seaViews) {
        this.seaViews = seaViews;
    }

    public int getPriceForNight() {
        return priceForNight;
    }

    public void setPriceForNight(int priceForNight) {
        this.priceForNight = priceForNight;
    }




    }


