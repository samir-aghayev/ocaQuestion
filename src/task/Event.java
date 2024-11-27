package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Event implements Comparable<Event> {
    private int id;
    private String title;
    private String description;
    private LocalDate date;
    private LocalTime time;

    public Event(int id, String title, String description, LocalDate date, LocalTime time) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.of(this.date, this.time);
    }


    @Override
    public int compareTo(Event that) {
        return this.getDateTime().compareTo(that.getDateTime());
    }

    @Override
    public String toString() {
        return "Event{id=%d, title='%s', description='%s',  time=%s}".formatted(id, title, description, time);
    }
}
