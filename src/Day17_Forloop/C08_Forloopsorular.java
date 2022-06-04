package Day17_Forloop;

public class C08_Forloopsorular {
    public static void main(String[] args) {
        //kullanıcıdan bir strıng isteyin
        //kullanıcının girdigi strıng palindrome olup olmadıgını kontroleden method oluşturun

        String input="adam";
        palındromekontrolet(input);
    }


    private static void palındromekontrolet(String input) {
        String Terstenınput="";
        for (int i = input.length() -1; i >=0 ; i--) {
            Terstenınput+=input.charAt(i);//artık burası girilen kelimeyi tersten yazdıracak

        }
        System.out.println("girdiginiz kelimenin tersten yazılışı: " + Terstenınput);

        if(input.equalsIgnoreCase(Terstenınput)) {//burasıda ınput ile tersınput birbirine eşit ise yani polındrome
            System.out.println("girdiginiz kelime palındrome");
        }else{
            System.out.println("girdiginiz kelime polındrome degil");

        }

    }
}
