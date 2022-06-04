package Day32_Data_tıme;

import java.time.LocalTime;

public class C02_Localtime {
    public static void main(String[] args) {
        LocalTime tm=LocalTime.now();
        System.out.println(tm); //22:09:57.326282
       int sayı=0;
        for (int i = 0; i <10000 ; i++) {
            sayı+=i;


        }

        LocalTime tmloopsonrası=LocalTime.now();
        System.out.println(tmloopsonrası); //
     //bir işlemin ne kadar sürede bittigini görmek istersek birer time objsi oluşturup aradaki farkı hesaplayabiliriz
        double nano1=tm.getNano();
        double nano2=tmloopsonrası.getNano();
        System.out.println("işlem" +(nano2-nano1)+ "nanosaniyedebitti");

        System.out.println(tm.plusMinutes(1000));
        //istersek zone ıd kullanarak istedigimiz bölgenin saati içinde obje oluşturabiliriz

    }
}


