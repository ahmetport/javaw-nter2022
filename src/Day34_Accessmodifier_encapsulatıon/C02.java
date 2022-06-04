package Day34_Accessmodifier_encapsulatıon;

public class C02 {
    public static void main(String[] args) {
        C01 obj=new C01();
        //C01.sayı=15; private access modifıere oldugundan ulaşılamaz
        obj.açıkstring="bye";//obje oluşturarak diger classtaki static açıkstringe deger atadım
        C01.açıksayı=50;//class iamini yazarak diger class daki açık sayıya ulaşıp deger atadım
       // obj.method1; private oldugundan method dahi olsa kullanamam
        //C01 objparametreli=new C01(5);// private yapınca çalışmaz
    }






}
