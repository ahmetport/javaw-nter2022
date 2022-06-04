package Day39_Overriding;

public class Araba {
   protected String hareket="arabalar teker ile hareket eder";
   protected String hız="arabalar motor gücüne göre hız yaparlar";
   protected String yakıt="arabalar farklı yakıtlar kullanabilir";
   protected String marka="arabalar üretildikleri markaya sahiptir";



    public void motor(){
        System.out.println("arabalar farklı markalrdan motor kullanılırlar");

    }

    public void yakıttüketimi(){
        System.out.println("arabalar motor gücüne göre yakıt tüketirler");

    }

}
