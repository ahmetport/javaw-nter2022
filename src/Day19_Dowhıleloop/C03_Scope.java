package Day19_Dowhıleloop;

public class C03_Scope {
    public static void main(String[] args) {
       //bir method içerisinde oluşturulan varıabler sadece oluşturuldukları methodda kullanılailirler
        //başka methodlarda kullanılmazlar, tummethodlarda kullanmak istedigimiz varıabler ları class levell oluşturuyoruz
        //statıc yaparsak tummethodları kullanabiliriz
        //statıc olmazsa o zaman sadece statıc olmayan methodlarda kullanılabilir
        //loop içinde oluşturulan varıabler loop içinde kullanılabilir ama loop dışında kullanılamaz

        //int sayı=10;
        //isim="veli yan";
    }
    public static void method(){
       // int sayı=10;
       // isim="veli yan";
    }
    public void method2(){
      //  int sayı=10;
       // isim="veli yan";
    }
}

