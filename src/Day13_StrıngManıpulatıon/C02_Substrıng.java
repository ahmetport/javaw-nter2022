package Day13_StrıngManıpulatıon;

public class C02_Substrıng {
    public static void main(String[] args) {


        //1-48 of 104 results for "nutella"
        //bu arama sonucundaki bulunan sonuç sayısı 100 den çok ise super az ise "az sonuç bulundu"

        String str = "1-48 of 104 results for\" nutella\"";
        int ilkspace = str.indexOf(" ");// 4 verecek
        int ikincispace = str.indexOf(" ", ilkspace + 1);//7
        int üçünçüspace = str.indexOf(" ", ikincispace + 1);//12

        String aramasonuçsayısıstr = str.substring(ikincispace + 1, üçünçüspace);//104 verir strin bu substrıng methodunu kullandım
       // System.out.println(aramasonuçsayısıstr);//104 string olarak

        int aramasonuçsayısıınt = Integer.valueOf(aramasonuçsayısıstr);//string i integer çevirdid sonucu artık integer aldık
         //matematıksel karşılaştırma yapmak için ıntegere çevirmeliyim

        if (aramasonuçsayısıınt > 100) {
            System.out.println("süper");
        } else {
            System.out.println("az sonuç bulundu");

        }
    }
}
