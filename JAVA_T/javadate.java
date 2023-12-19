import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import the LocalDate class

public class javadate {
    public static void main(String[] args){
        LocalDate myobj = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        LocalDateTime mytimedate = LocalDateTime.now();
        DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = mytimedate.format(myformatobj);

        System.out.println(myobj);
        System.out.println(mytime);
        System.out.println("Before formatting: "+ mytimedate);
        System.out.println("After formatting: " + formattedDate);


    }

    
}
