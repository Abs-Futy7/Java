/*
 Write a Java program to create a class called "Event" with attributes for event name,
 date, and location. Create subclasses "Seminar" and "MusicalPerformance" that add
 specific attributes like number of speakers for seminars and performer list for concerts.
 Implement methods to display event details and check for conflicts in the event schedule.
 */


class Event {
    private String name;
    private String date;
    private String location;

    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void displayEventDetails() {
        System.out.println("Event Name: " + name);
        System.out.println("Event Date: " + date);
        System.out.println("Event Location: " + location);
    }

    public boolean isConflict(Event otherEvent) {
        return this.date.equals(otherEvent.date) && this.location.equals(otherEvent.location);
    }
}

class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String name, String date, String location, int numberOfSpeakers) {
        super(name, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}

class MusicalPerformance extends Event {
    private int numberOfPerformers;

    public MusicalPerformance(String name, String date, String location, int numberOfPerformers) {
        super(name, date, location);
        this.numberOfPerformers = numberOfPerformers;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Number of Performers: " + numberOfPerformers);
    }
}

public class EventManagement {
    public static void main(String[] args) {
    
        Seminar seminar = new Seminar("TechTalk 2024", "01 Dec 2024", "Dhaka University", 5);
        // Create a musical performance
        MusicalPerformance concert = new MusicalPerformance("Winter Fest", "01 Dec 2024", "Dhaka University", 10);

        // Display event details
        System.out.println("Seminar Details:");
        seminar.displayEventDetails();

        System.out.println("\nMusical Performance Details:");
        concert.displayEventDetails();

        // Check for scheduling conflicts
        if (seminar.isConflict(concert)) {
            System.out.println("\nConflict Detected: Both events are scheduled at the same date and location.");
        } else {
            System.out.println("\nNo conflict detected between the events.");
        }
    }
}
