import com.engeto.ja.du.Bookingtime;
import com.engeto.ja.du.Guest;
import com.engeto.ja.du.ListOfBookings;
import com.engeto.ja.du.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Guest guest = new Guest();
        Guest guest1 = new Guest();

        guest.setNameAndSurname("Adéla Malíková");
        guest.setDatumNarozeni("(1993-03-13)");

        guest1.setNameAndSurname("Jan Dvořáček");
        guest1.setDatumNarozeni("(1995-05-05)");

        Room room = new Room();
        Room room1 = new Room();

        room.setNoOfRoom("Pokoj číslo 1.,");
        room.setNoOfBeds("jednolůžkový pokoj,");
        room.setBalcony("s balkónem,");
        room.setSeaViews("s výhledem na moře,");
        room.setPriceForNight("1000kč/noc.");

        room1.setNoOfRoom("Pokoj číslo 3.");
        room1.setNoOfBeds("třílůžkový pokoj");
        room1.setBalcony("bez balkónu");
        room1.setSeaViews("s výhledem na moře");
        room1.setPriceForNight("2400kč/noc");

        Bookingtime bookingtime = new Bookingtime();
        Bookingtime bookingtime1 = new Bookingtime();

        bookingtime.setBooking("19.7.2021 - 26.7.2021");
        bookingtime1.setBooking("1.9.2021 - 14.9.2021");

        ListOfBookings listOfBookings = new ListOfBookings();
        ListOfBookings listOfBookings1 = new ListOfBookings();

        listOfBookings.setNameAndSurname("Adéla Malíková");
        listOfBookings.setNoOfRoom("Pokoj číslo 1.");
        listOfBookings.setBooking("19.7.2021 - 26.7.2021");

        listOfBookings1.setNameAndSurname("Adéla Malíková a Jan Dvořáček");
        listOfBookings1.setNoOfRoom("Pokoj číslo 3.");
        listOfBookings1.setBooking("1.9.2021 - 14.9.2021");

        List<ListOfBookings> bookingsList = new ArrayList<>();
        bookingsList.add(listOfBookings);
        bookingsList.add(listOfBookings1);


        System.out.println(guest.getNameAndSurname() + " " + guest.getDatumNarozeni());
        System.out.println(room.getNoOfRoom() + " " + room.getNoOfBeds() + " " + room.getBalcony() + " " + room.getSeaViews() + " " + room.getPriceForNight());
        System.out.println("Rezervace:" + " " + bookingtime.getBooking());
        System.out.println();
        System.out.println(guest.getNameAndSurname() + " " + guest.getDatumNarozeni() + " " + guest1.getNameAndSurname() + " " + guest1.getDatumNarozeni());
        System.out.println(room1.getNoOfRoom() + " " + room1.getNoOfBeds() + " " + room1.getBalcony() + " " + room1.getSeaViews() + " " + room1.getPriceForNight());
        System.out.println("Rezervace:" + " " + bookingtime1.getBooking());
        System.out.println();

        for (ListOfBookings bookings : bookingsList) {
            System.out.println(bookings.getNameAndSurname() + " " + bookings.getNoOfRoom() + " " + bookings.getBooking());

        }


    }

}