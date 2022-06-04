package Day36_Inherıtance;

public class Chıld extends Parent{
    Chıld(){
       // super();//görsekte görmesekte burdadır
        System.out.println("chıld cons çalıştı");
    }
//tüm classlarda biz görmesek bile javanın oluşturdugu default cons vardır
    //tüm extends keyword kullanan classların CONSTRUCTURLARIN ilk satırında biz görmesek bile super()cons call vardır
    //yani parent classın parametresiz constructur ı call
    public static void main(String[] args) {
        Chıld chıld=new Chıld();

    }
}
