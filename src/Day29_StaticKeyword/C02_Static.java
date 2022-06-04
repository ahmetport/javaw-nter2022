package Day29_StaticKeyword;

public class C02_Static {
    public static void main(String[] args) {
        //başka classdaki static class üyelerine ulaşabilmek için sadece clasismi.statıcuyeismi yazmamız yeterlidir

        System.out.println(C01_sTATİC.okultelefonu);
        C01_sTATİC.okultelefonu="3214587965";
        System.out.println(C01_sTATİC.okultelefonu); //TELEFON NO DEGİŞİR



        C01_sTATİC obj1=new C01_sTATİC();
        C01_sTATİC obj2=new C01_sTATİC();

        System.out.println(obj2.okulismi); //yıldız koleji yazdırır
        obj2.okulismi="sabır koleji";
        System.out.println(obj1.okulismi);  //yine yıldız koleji yazdırır çünkü atamayı biz obj2 ye yaptık

    }
}
