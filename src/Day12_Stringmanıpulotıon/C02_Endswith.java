package Day12_Stringmanıpulotıon;

public class C02_Endswith {
    public static void main(String[] args) {
        //kullanıcıdan email adresini isteyin mail @gmail .com içermiyorsa "lütfen gmail adresi giriniz yazdırın
        //@gmail.com ile bitiyorsa "email adresiniz kaydedıldi"
        //@gmail ile bitmiyorsa "lütfen yazımı kontrol edin"yazdırın


        String email = "mulkiyeayboy@gmail.com";//scanner koymadık bilerek
        String aranananmetin= "@gmail.com";

        if(!email.contains(aranananmetin)){
            System.out.println("gmail adresi giriniz");
        }else if(email.endsWith(aranananmetin)){
            System.out.println("email adresiniz kaydedildi");
        }else{
            System.out.println("lütfen yazımı kontrol edin");
        }
    }
}
