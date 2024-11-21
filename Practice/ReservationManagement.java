import java.util.*;

class TravelApp {
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    public TravelApp() {
        this.flights = new ArrayList<>();
        this.hotels = new ArrayList<>();
    }

    public void searchFlights(String origin, String destination, String date, int numPassengers) {
        System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers.");
    }

    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests.");
    }

    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        int confirmationNumber = generateConfirmationNumber();
        Flight flight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
        flight.setConfirmationNumber(confirmationNumber);
        flights.add(flight);
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
    }

    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
        int confirmationNumber = generateConfirmationNumber();
        Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
        hotel.setConfirmationNumber(confirmationNumber);
        hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);
    }

    public void cancelReservation(int confirmationNumber) {
        flights.removeIf(flight -> flight.getConfirmationNumber() == confirmationNumber);
        hotels.removeIf(hotel -> hotel.getConfirmationNumber() == confirmationNumber);
        System.out.println("Reservation with confirmation number " + confirmationNumber + " cancelled (if it existed).");
    }

    private int generateConfirmationNumber() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }
}

class Flight {
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassengers;
    private double price;
    private int confirmationNumber;

    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.price = price;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}

class Hotel {
    private int hotelId;
    private String name;
    private String location;
    private String checkIn;
    private String checkOut;
    private int numGuests;
    private double price;
    private int confirmationNumber;

    public Hotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numGuests = numGuests;
        this.price = price;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}

public class ReservationManagement {
    public static void main(String[] args) {
        TravelApp app = new TravelApp();
        app.searchFlights("New York", "London", "2022-09-01", 1);
        app.searchHotels("London", "2022-08-01", "2022-09-05", 2);
        app.bookFlight(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 700.00);
        app.bookHotel(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 100.00);
        app.cancelReservation(12345670); // Random confirmation number may not match
    }
}

