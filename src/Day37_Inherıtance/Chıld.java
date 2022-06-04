package Day37_Inherıtance;

import Day36_Inherıtance.Parent;

public class Chıld extends Parent {

        //bir classı chıld class yaptıgımızda parent classdakı cons ulaşması gerekir
        //bu durumda parent classdaki cons tırın access modıfıer public veya
        //protected olmalıdır.chıld classda tüm constructurların ilk satırına javanın
        //yerleştirdigi constructur parametresizdir yani super()dir.
    Chıld(){
            super();
            System.out.println("chıld class parametresiz cons ");
    }
    Chıld(int s){
        System.out.println("chıld class parametreli cons");
    }
    Chıld(int sayı1,int sayı2){
        //egerparent classdan parametresiz cons degilde başkasını çalıştırmak isterseniz bunu chıld classdaki cons ın
        //ilk satırına yazmalısınız
        super(sayı1,sayı2);
        System.out.println("iki parametreli super constructur çalıştı");
    }

    public static void main(String[] args) {
        Chıld chıld=new Chıld(5,8);
//ilkönce parent deki cons çalışır sonra bizim classdaki çalışır
    }
}
