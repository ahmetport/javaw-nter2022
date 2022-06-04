package Day12_Stringmanıpulotıon;

public class C01_Contaıns {
    public static void main(String[] args) {
        //kullanıcıdan email adresini isteyin mail @gmail .com içermiyorsa "lütfen gmail adresi giriniz yazdırın
        //@gmail.com ile bitiyorsa "email adresiniz kaydedıldi"
        //@gmail ile bitmiyorsa "lütfen yazımı kontrol edin"yazdırın


        String email = "mulkiyeayboy@gmail.com";//scanner koymadık bilerek
        String aranananmetin= "@gmail.com";


        if (!email.contains(aranananmetin)) {
            System.out.println("lütfen gmail adresini giriniz");
        } else if (email.lastIndexOf(aranananmetin) == (email.length() - 10)){ ;//gmail.com sondan sayınca 10 oluyor o yuzden

            System.out.println("email adresiniz kaydedildi");

        }else{
            System.out.println("lütfen yazımı kontrol edin");

        }

    }
}
