package Day13_StrıngManıpulatıon;

public class C03_soru2 {
    public static void main(String[] args) {

        //string şeklinde verilen aşagıdaki fiyatlarin toplamını bulunuz
        //string str1=$13.99
        //string str2=$10.55

        String str1="$13.99";
        String str2="$10.55";
        str1=str1.replaceAll("\\D" , "");//1399 AMA STRİNG
        str2=str2.replaceAll("\\D" , "");//1055 ama string

        double str1sayı=Double.valueOf(str1);
        double str2sayı=Double.valueOf(str2);

        double sonuc=(str1sayı+str2sayı)/100;
        System.out.println("sayıların toplamı: $" +sonuc);





    }
}
