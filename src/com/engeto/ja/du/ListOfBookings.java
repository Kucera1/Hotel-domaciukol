package com.engeto.ja.du;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Bookingtime> bookingtimes = new ArrayList<>();
    private String nameAndSurname;
    private String noOfRoom;
    private String booking;

    public List<Bookingtime> getBookingtimes() {
        return bookingtimes;
    }

    public void setBookingtimes(List<Bookingtime> bookingtimes) {
        this.bookingtimes = bookingtimes;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(String noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }
}
