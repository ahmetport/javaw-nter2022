package Day33_Varargs;

public class C06_Stringbuılderr {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("prize dikkat");
        System.out.println(sb1.insert(12,"edin"));//prize dikkatedin
        String str="hayatta cok güzel şeyler var";
        System.out.println(sb1.insert(0,str,0,7));//hayattaprize dikkatedin
        System.out.println(sb1.reverse());//cümleyi tersine çevir
        System.out.println(sb1.reverse());//cümleyi tersine çevir
        System.out.println(sb1);
        System.out.println(sb1.equals(str)); //false


    }
}
