package task;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;


public class EventScheduler {
    private static final List<Event> EVENTS = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int eventIdCounter = 1;

    private EventScheduler() {
    }

    public static void displayMenu() {
        System.out.println("1 Add event");
        System.out.println("2 List up coming events");
        System.out.println("3 Remove event");
        System.out.println("4 Find events by date");
        System.out.println("5 Exit");
    }

    public static void addEvent() {
        System.out.print("Enter title: ");
        String title = SCANNER.nextLine();
        System.out.print("Enter description: ");
        String description = SCANNER.nextLine();
        System.out.print("Enter date (format yyyy-MM-dd): ");
        String date = SCANNER.nextLine().trim();
        LocalDate localDate = parseDate(date);
        System.out.print("Enter time (format HH:mm): ");
        String time = SCANNER.nextLine().trim();
        LocalTime localTime = parseTime(time);
        if (checkDate(localDate, localTime)) {
            System.out.println("You can't create an event in the past history");
            return;
        }
        EVENTS.add(new Event(eventIdCounter++, title, description, localDate, localTime));
    }

    public static void listUpComingEvents() {
        Collections.sort(EVENTS);
        for (Event event : EVENTS) {
            LocalDateTime localDateTime = event.getDateTime();
            if (localDateTime.isAfter(LocalDateTime.now())) {
                System.out.println(event.getId() + ", ");
                System.out.println(event.getTitle() + ", ");
                System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("EEEE, MMMM, dd, yyyy, h:mm")) + ", ");
                System.out.println(remainingDate(localDateTime));
            }
        }
    }


    public static void removeEvent() {
        System.out.println("Enter event title: ");
        String title = SCANNER.nextLine().trim();
        Event event = getEvent(title);
        if (Objects.isNull(event)) {
            System.out.println("No such event was found");
            return;
        }
        System.out.println("Are you sure you want to delete this event? (yes/no): ");
        String answer = SCANNER.nextLine().trim().toLowerCase();
        if (answer.equals("yes")) {
            EVENTS.remove(event);
        }
    }

    public static void findElementsByDate() {
        System.out.print("Enter date (format yyyy-MM-dd): ");
        String date = SCANNER.nextLine().trim();
        LocalDate localDate = parseDate(date);
        for (Event event : EVENTS) {
            if (event.getDate().equals(localDate)) {
                System.out.println(event);
            }
        }
    }


    private static LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            System.out.print("Invalid date format, (yyyy-MM-dd)");
            System.out.print("Enter date (format yyyy-MM-dd): ");
            date = SCANNER.nextLine().trim();
            return parseDate(date);
        }
    }


    private static LocalTime parseTime(String time) {
        try {
            return LocalTime.parse(time);
        } catch (DateTimeParseException e) {
            System.out.print("Invalid time format, (HH:mm)");
            System.out.print("Enter time (format HH:mm): ");
            time = SCANNER.nextLine().trim();
            return parseTime(time);
        }
    }

    private static boolean checkDate(LocalDate localDate, LocalTime localTime) {
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        return localDateTime.isBefore(LocalDateTime.now());
    }

    private static Event getEvent(String title) {
        for (Event event : EVENTS) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }

    private static String remainingDate(LocalDateTime localDateTime) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        Period period = Period.between(dateTimeNow.toLocalDate(), localDateTime.toLocalDate());
        Duration duration = Duration.between(dateTimeNow, localDateTime);
        return period.getYears() + " year, " + period.getMonths() + " month, " + period.getDays() + " day, " + duration.toHoursPart() + " hour, " + duration.toMinutesPart()+" minute";
    }
}
