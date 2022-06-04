package Day15_methodCreatıon;

public class C06_MethodCreatıon {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki variablenin degerlerini toplayan bir method oluşturalım
        ikisayıtopla(a,b);//bu kodu silersem method çalışmaz çünkü çagırmam lazım buraya istedigim degeri atarım
                            //mesela 25 ve 50 atayabilirim yine çalışır atadıgım degerleri toplar
        C04.dörtharfitersineçevir("sema");//methodu buraya çagırdık çalıştı

    }//main method sonu kodun çalışması durur

      //method çagrılırsa çalışır
    private static void ikisayıtopla(int a, int b) {
        System.out.println("verilen iki sayının toplamı: "+ (a+b));

    }
}
