package Day04_Wrapperandmodules;

public class C02_Wrapperclass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";
        //verilen iki strindeki sayıları toplayın

        System.out.println(str1+str2);//1234523456 yazar burdada wrapper imdada yetişir

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));//35801 ŞİMDİ TOPLADIK

    }
}
