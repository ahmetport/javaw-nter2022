package Day35_Inherıtance;

public class Chıld01 extends Parent { //extends yazıyoruz sonrada kullanacagımız classsın ismini yazıyoruz
    public static void main(String[] args) {
        //chıld class hiçbir objeye ihtiyaç duymadan parent classdaki variable
        //ve methodlara ulaşabilir
        System.out.println(isim);//neval  hiç obje oluşturmadan parent classından isim ve fabrikayı aldık
        System.out.println(fabrika);//yıldız tekstil
        method1();
        method2();

    }
}
