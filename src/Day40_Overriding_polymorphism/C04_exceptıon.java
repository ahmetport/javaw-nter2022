package Day40_Overriding_polymorphism;

public class C04_exceptıon {
    public static void main(String[] args) {
        //string olarak verilen bir sayıyı ıntegere çevirip 2 katını ekranda yazdıralım
        String str="1234a";


        //str içinde sayı olmayan bir karakter olursa
        //exceptıon verir

        try{
            int sayı=Integer.parseInt(str);
            System.out.println("girilen sayının iki katı: " +2*sayı);
           // int sayı =Integer.parseInt(str);
            System.out.println("girilen sayının iki katı: " +2*sayı);

        }catch(Exception e){
            System.out.println("girdiginiz string sayı olmayan elementler verdi");
        }


        }
    }

