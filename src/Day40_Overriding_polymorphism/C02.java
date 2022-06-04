package Day40_Overriding_polymorphism;

public class C02 extends C01{
    public static void main(String[] args) {
        C02 obj=new C02();
        obj.method1();//parentten method1 çalışır
        obj.method2();//chıld method2
        C01 obj2=new C02();
        obj2.method1();//parentmethod1
        obj2.method2();//chıld method2
        C01 obj3=new C01();
        obj3.method1();//parent method1
        obj3. method2();//parent method2

        }





    @Override
    public void method2() {
        System.out.println("chıld method2");
        //bu natosyon overiden method ile overriding methodu birbirine baglar
        //farkında olmadan overriden method silinirse veya sıgnature degişirse
        //builişki bozulacagı içinjava cte verir
    }
}
