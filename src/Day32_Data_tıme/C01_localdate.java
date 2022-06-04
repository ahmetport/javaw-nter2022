package Day32_Data_tıme;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_localdate {
    public static void main(String[] args) {
        LocalDate trh=LocalDate.now(); //objenin oluşturuldugu tarihi atar
        LocalDate başkatrh= LocalDate.of(1984,5,13);
        //istedigimiz ay gün degerine göre bize obje verir
          //get li methodlarla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh);//2022-03-31
        System.out.println(trh.getDayOfMonth()); //31
        System.out.println(trh.getDayOfWeek()); //thursday
        System.out.println(trh.getDayOfYear()); //2022
        System.out.println(trh.getMonthValue());//3 verir
        //bir tarihten istedigimiz kadar geri ve ileri gidebiliriz
        System.out.println(trh.minusWeeks(20)); //2021-11-11
        System.out.println(trh.plusMonths(9)); //2022-12-31
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); //2022-04-01

      //is ile başlayanlar boolean sonuçlar döndürür
        System.out.println(LocalDate.now().isLeapYear()); //false

        System.out.println(trh.isAfter(başkatrh)); //TRUE



    }

}
