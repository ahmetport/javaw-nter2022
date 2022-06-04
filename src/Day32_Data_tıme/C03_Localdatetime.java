package Day32_Data_tıme;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_Localdatetime {
    public static void main(String[] args) {
        LocalDateTime tarihsaat= LocalDateTime.now(); //
        System.out.println(tarihsaat);

        System.out.println(tarihsaat.plusYears(3).plusMonths(5).plusDays(15));

    }


}
