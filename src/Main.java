import com.engeto.ja.du.Booking;
import com.engeto.ja.du.Guest;
import com.engeto.ja.du.ListOfBookings;
import com.engeto.ja.du.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Guest guest = new Guest("Adéla Malíková", LocalDate.of(1993, 1, 13));

        Guest guest1 = new Guest("Jan Dvořáček", LocalDate.of(1995, 05, 5));

        Room room = new Room(1, "jednolůžkový pokoj,", "s balkónem,", "s výhledem na moře,", 1000);
        Room room1 = new Room(3, "trojlůžkový pokoj,", "bez balkónu,", "s výhledem na moře,", 2400);

        Booking booking = new Booking(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7,26));
        Booking booking1 = new Booking(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));


        ListOfBookings listOfBookings = new ListOfBookings("Adéla Malíková", 1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));
        ListOfBookings listOfBookings1 = new ListOfBookings("Adéla Malíková a Jan Dvořáček", 3, LocalDate.of(2021,9, 1), LocalDate.of(2021, 9, 14));

        System.out.println(guest.getNameAndSurname() + " " + guest.getBirthDate());
        System.out.println("Pokoj číslo:" + room.getNoOfRoom() + ","  + " " + room.getNoOfBeds() + " " + room.getBalcony() + " " + room.getSeaViews() + " " + room.getPriceForNight() + "kč/noc");
        System.out.println(booking.getFrom() + " - " + booking.getTo());
        System.out.println();
        System.out.println(guest.getNameAndSurname() + " a " + guest1.getNameAndSurname());
        System.out.println("Pokoj číslo:" + room1.getNoOfRoom() + "," + " " + room1.getNoOfBeds() + " " + room1.getBalcony() + " " + room1.getSeaViews() + " " + room1.getPriceForNight() + "kč/noc");
        System.out.println(booking1.getFrom() + " - " + booking1.getTo() );
        System.out.println();
        System.out.println("Seznam rezervací:");

        List<ListOfBookings> bookingsList = new ArrayList<>();
        bookingsList.add(listOfBookings);
        bookingsList.add(listOfBookings1);

        for (ListOfBookings bookings : bookingsList) {
            System.out.println(bookings.getNameAndSurname() + "," + " " + "Pokoj číslo:" + bookings.getNoOfRoom()  + ".," + " " + bookings.getBookingFrom() + " - " + bookings.getBookingTo());
        }

        }


    }

