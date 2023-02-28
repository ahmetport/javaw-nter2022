package Day32_Data_tıme;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_Formmatter {
    public static void main(String[] args) {
        //formatlayıp istedigimiz gibi alabiliriz

        LocalDateTime tarihsaat= LocalDateTime.now();
        System.out.println(tarihsaat); //2022-03-31T22:39:59.619855500
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(formatter.format(tarihsaat)); //31/3/2022
        DateTimeFormatter formattersaat=DateTimeFormatter.ofPattern("h:mm:ss a");
        System.out.println(formattersaat.format(tarihsaat));//21: 52


        LocalDate bugun=LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(1984,05,13);
        System.out.println(Period.between(dogumgunu,bugun)); //P37Y10M20D
        System.out.println(Period.between(dogumgunu,bugun).getYears()); //37
    }


}
