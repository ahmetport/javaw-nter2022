package Day13_StrıngManıpulatıon;

import java.util.Scanner;

public class C07_SORU {
    public static void main(String[] args) {
        //kullanıcının ismini soyismini ve kredi kart bilgisini isteyin aşagıdaki gibi yazdırın
        //A**** P*******
        //**** **** **** 1234
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String name=scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String surname= scan.nextLine();
        System.out.println("kart bilginizi giriniz");
        String pass =scan.nextLine();



        name=name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w" , "*");


        surname=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w" , "*");
        pass=pass.substring(0,4)
                .replaceAll("\\d" , "*") +" " +pass.substring(4,8)
                .replaceAll("\\d" , "*") +" " +pass.substring(8,12)
                .replaceAll("\\d" , "*")+ " " + pass.substring(12,16);



        System.out.println("isim:" + name+ "\nsoyisim: "+ surname);
        System.out.println("kart no:" +pass);
        //hocanın çözümü
        String isim="oguzhan";
        String soyisim="BALKAYA";
        String kKno="1234567890123456";

        String yeniisim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S" , "*");//EGER İKİ İSİMLİ İSE \\S : KULLANILIR
        String yenisoyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\S" , "*");

        String yenikKno="**** **** **** 1234" +kKno.substring(12);
        System.out.println("isim - soyisim:  "+yeniisim+" "+yenisoyisim+" \nkart no: " +yenikKno);












    }
}
