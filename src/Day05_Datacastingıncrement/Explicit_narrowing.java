package Day05_Datacastingıncrement;

public class Explicit_narrowing {
    public static void main(String[] args) {

        int sayı1=879;
        double sayı2=10;

       // double sayı3=sayı1/sayı2;
        //System.out.println(sayı3);//87.9

        int sayı4=(int) (sayı1/sayı2);//java izin vermez deger double variable ınteger o yüzden double ınt atayacagız
        //java bunu otomatik yapmaz sorumlulugu bize verir
        System.out.println(sayı4);//87 sayı ınteger oldugundan tam sayı olur




    }
}
