package Day13_StrıngManıpulatıon;

public class C03_stringmanıpulatıonsoru1 {
    public static void main(String[] args) {

        String str="java ögrenmek123 çok güzel@";
        // bu stringi java ögrenmek çok güzele çevirin
        System.out.println("cümlenin ilk hali: "+ str);
        str=str.replace("123" , "").replace("@" , "");
        System.out.println("cümlenin son hali: " +str);


    }
}
