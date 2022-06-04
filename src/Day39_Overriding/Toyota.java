package Day39_Overriding;

public class Toyota extends Araba {
    String hız="toyota araçlar max 220 km hız yaparlar";
    String marka="toyota";
    String şirketmerkezi="japonya";




   protected String hareket="arabalar teker ile hareket eder";
   protected String yakıt="arabalar farklı yakıtlar kullanabilir";
   public void motor(){
        System.out.println("arabalar farklı markalrdan motor kullanılırlar");
   }

    public void garanti(){
        System.out.println("toyota araçlar 10 yıl garantilidir");

    }

}

