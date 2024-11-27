import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DateTest {
    public static void main(String[] args) {
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm");
        String localDateTime=LocalDateTime.of(2024, 10, 15, 22, 38, 55, 55555555).format(format);
        System.out.println(localDateTime);
        Set<Integer> a=new TreeSet<>();

    }
}
