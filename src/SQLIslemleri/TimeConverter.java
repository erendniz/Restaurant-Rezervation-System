package SQLIslemleri;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConverter {
    public int convertTime(String time){
        int i,inttime = 0;
        for(i = 0;i<time.length();i++){
            if(time.charAt(i) == ':'){
                inttime += (60 * Integer.parseInt(time.substring(0,i))) + Integer.parseInt(time.substring(i+1));
                break;
            }
        }
        return inttime;
    }

    public int convertDate(String date){
        int i,intdate = 0;
        intdate +=  Integer.parseInt(date.substring(6))*365;
        intdate +=  Integer.parseInt(date.substring(0,2));
        for(i=1;i<=Integer.parseInt(date.substring(3,5));i++){
            switch(i){
                case 2: intdate += 28;
                break;
                case 4,6,9,11: intdate += 30;
                break;
                case 1,3,5,7,8,10,12: intdate += 31;
                break;
            }
        }

        return intdate;
    }

    public String CurrentTime(){
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatnow = DateTimeFormatter.ofPattern("HH:mm");

        return now.format(formatnow);
    }

    public String CurrentDate(){
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatnow = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return now.format(formatnow);
    }

    public String IncrementDate(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate localDate = LocalDate.parse(date, formatter);
    LocalDate nextDate = localDate.plusDays(1);
    return nextDate.format(formatter);
}

    

    public String IncrementTime(String zaman,int minute) {
        LocalTime time = LocalTime.parse(zaman);
        LocalTime newTime = time.plusMinutes(minute);

        return newTime.toString();
    }
}
