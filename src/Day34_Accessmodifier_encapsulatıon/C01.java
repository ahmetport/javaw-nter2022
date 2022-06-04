package Day34_Accessmodifier_encapsulatıon;

public class C01 {
    private static int sayı=10;
    private static String str="java";
    static int açıksayı=20;//bunun access modifieri default olur
    String açıkstring="Hi";//bunun access modifieri default olur
    public static int halkaaçıksayı=15;
    protected static int aileyeözel=40;
   protected C01(){
        //bu constructurun acces modifierı default access modifıerdır
        //dolayısıyla içinde oldugumuz paketin dışında bu claasdan obje oluşturulamaz

    }
  private  C01(int numara){
        System.out.println("parametreli cons çalıştı");
    }
    private void method(){

    }

}
