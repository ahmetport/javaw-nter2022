package Day20_Scope_Arrays;

public class C01_Scope {
    int sayı;
    String branşismi="java";
    boolean okuldamı;
    public static void main(String[] args) {
       // sayı=10; sayı varıable ı statıc olmadıgı için main methoddan kullanılamaz
        //instance varıabler  statıc methoddan ulaşabilmek için obje oluşturmamız gerekir

        C01_Scope obj=new C01_Scope();//
        System.out.println(obj.sayı);//0 atar
        obj.sayı=10;
        System.out.println(obj.sayı);//10 verir


        C01_Scope obj1=new C01_Scope();
        System.out.println(obj1.sayı);//0 olur
        System.out.println(obj1.branşismi);//java yazdırır

        obj.okuldamı=true;
        System.out.println(obj1.okuldamı);//false





    }
}
