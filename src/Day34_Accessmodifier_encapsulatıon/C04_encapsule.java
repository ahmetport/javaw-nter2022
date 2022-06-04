package Day34_Accessmodifier_encapsulatıon;

public class C04_encapsule {
    public static void main(String[] args) {

        //bir variable encapsule etmek için
        //1-access madifierı private yaparım
        //2-okuma ve yazma özelliklerini kullanılmasını istedigimiz gibi sınırlayabiliriz eger sadece okunmasını istiyorsaniz
        //eger sadece okunmasını istiyorsak getter sadece deger girilebilsin setter methodlarında oluştururuz.
        //bir variable için hem getter hem setter oluşturursanız o variable public olmuş gibi hem okuyup hemde yazılmasını
        //saglayabilirsiniz
        CO3 obj=new CO3();
        System.out.println(obj.getSayı());//0 default degeri getirir
        obj.setStr("java java java");
        System.out.println(obj.getStr());//java java java
        System.out.println(obj);//CO3{sayı=0, str='java java java'}



    }
}
