package com.engeto.ja.du;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> bookingList = new ArrayList<>();
    private String nameAndSurname;
    private int noOfRoom;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;

    public ListOfBookings(String nameAndSurname, int noOfRoom, LocalDate bookingFrom, LocalDate bookingTo) {
        this.bookingList = bookingList;
        this.nameAndSurname = nameAndSurname;
        this.noOfRoom = noOfRoom;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public LocalDate getBookingFrom() {
        return bookingFrom;
    }

    public void setBookingFrom(LocalDate bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    public LocalDate getBookingTo() {
        return bookingTo;
    }

    public void setBookingTo(LocalDate bookingTo) {
        this.bookingTo = bookingTo;
    }
}
