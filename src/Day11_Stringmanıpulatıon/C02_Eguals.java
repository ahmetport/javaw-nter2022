package Day11_Stringmanıpulatıon;

public class C02_Eguals {
    public static void main(String[] args) {
      //  String str1= "ali can";
      //  String str2= "ali can";
       // System.out.println("str1 :" + str1);
       // System.out.println("str2 :" + str2);

       // System.out.println("== ile karşılaştır :" +(str1==str2));//true
       // System.out.println("eguals ile karşılaştır:" + str1.equals(str2));//true

       // String str3=str1+"";
      //  System.out.println("str3 : "+ str3);
       // System.out.println("== ile karşılaştır :" + (str3==str2));//string her zaman dogru sonucu vermez
       // System.out.println("eguals ile karşılaştır:" + str3.equals(str2));//bunun için eguals tercih ederiz

        String str5="hasan";
        String str6="HASAN";
        System.out.println(str5.equals(str6));//false verir
        System.out.println(str5.toUpperCase().equals(str6));//true




    }
}
