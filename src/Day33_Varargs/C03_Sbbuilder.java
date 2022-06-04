package Day33_Varargs;

public class C03_Sbbuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("java çok güzel");
        StringBuilder sb3=new StringBuilder(10);
        System.out.println("sb1 lenght:"+sb1.length()); //0
        System.out.println("sb1 capacıty:"+sb1.capacity()); //16

        System.out.println("sb2 lenght:"+sb2.length()); //14
        System.out.println("sb2 capacıty:"+sb2.capacity());//30

        System.out.println("sb3 lenght:"+sb3.length()); //0
        System.out.println("sb3 capacıty:"+sb3.capacity());//10

        //append methodu ıle ekleme yapabiliriz

        sb1.append("java").append(" ").append("cok").append (" ").append("güzel");//
        System.out.println("sb1 lenght:"+sb1.length()); //14
        System.out.println("sb1 capacıty:"+sb1.capacity());//16

        sb1.append(3);
        System.out.println(sb1); //java çok güzel3
        sb1.append(true);
        System.out.println(sb1); //

        System.out.println("sb1 lenght:"+sb1.length()); //19
        System.out.println("sb1 capacıty:"+sb1.capacity());//34

        sb1.trimToSize(); //eşitler ikisini
        System.out.println("sb1 lenght:"+sb1.length()); //19
        System.out.println("sb1 capacıty:"+sb1.capacity());//19











    }
}
