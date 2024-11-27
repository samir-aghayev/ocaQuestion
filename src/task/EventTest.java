package task;

import java.util.Scanner;

public class EventTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning=true;
        while (isRunning) {
            EventScheduler.displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> EventScheduler.addEvent();
                case 2 -> EventScheduler.listUpComingEvents();
                case 3 -> EventScheduler.removeEvent();
                case 4 -> EventScheduler.findElementsByDate();
                case 5 -> isRunning=false;
            }
        }
        scanner.close();
    }
}
