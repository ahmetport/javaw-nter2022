package Day13_StrıngManıpulatıon;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        //kullanıcıdan dört harfli bir kelime isteyin ve girilen kelimeyi tersten yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört harfli kelime giriniz");
        String str=scan.nextLine();
        if(!(str.length()==4)){
            System.out.println("giriş hatalı");
        }else{
            System.out.println(""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0));

        }// hoca substring ile yaptı bizde yapalım
        String input="mavi";
        String str1=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(str1);


    }
}
