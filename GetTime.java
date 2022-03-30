import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GetTime {
    
    public static void main(String[] args){
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("Current Date and Time: " + now.format(formatter));
        System.out.println("Svitlana Kyryrchenko");
    }

}