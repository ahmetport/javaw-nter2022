package Day09_Ternaryswıtch;

public class C06_Ternarysoru3 {
    public static void main(String[] args) {
        //ekranda ne gorürüz
        int y=5;
        int z=1;
        int a=y<10 ? ++
                y : z++;
        System.out.println(y +"," +z+ "," +a );

        //bazen ternary daki iki sonucun data türleri farklı olabilir
        //verilen sayı 100 den büyükse sayının karesini alıp yazdırın
        //yüzden küçükse "sayı 100 den büyük olamalı " yazdırın

        int sayı=99;
        //ternary bize sonuç getirdiginden ya sonucu direk yazdırırız
        //veya bir degişken atariz eger sonuçlar farklı data türlerinde ise
        //atama yapacagımız variablenin data türü tek olacagından atama yapamayız
        //SADECE direk yazdırabiliriz

        System.out.println(sayı>100 ? sayı*sayı : "sayı 100 den büyük olmalı yazdır");




    }
}
