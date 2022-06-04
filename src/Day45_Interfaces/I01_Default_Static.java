package Day45_Interfaces;

public abstract class I01_Default_Static {
    protected static void method3() {
    }

    /*
       Bir interface'de default veya static olarak tanimlanan ve body'si olan
       method'larin override edilmesi mecburi DEGILDIR
       Eger static olarak tanimlanmissa zaten override edemeyiz
        */
    public abstract void method1();

     /*
    Interface'lerde sadece abstract method'lar bulunur
    body'si olan concrete bir method olusturmak istedigimizde
    Java CTE verir
    Ancak Java8 ve uzeri versiyonlarda, istisnai olarak
    static veya default olarak tanimlanan method'larin body'si olabilir
    ancak burada kullanilan default keyword'u access modifier degildir
    cunku Interface'lerde tum method'lar public ve abstract'ti
    asagidaki ornekte gorulecegi gibi default olarak tanimlanmis
    bir method'a access modifier olarak public yazabilirsiniz
    (access modifier yazmasak da Java method'u public olarak kabul edecektir )
     */


    }

