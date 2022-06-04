package Day10_Swıtchandstrıng;

public class C03_Concate {
    public static void main(String[] args) {
        //concat yapmak için iki ihtimalimiz var daha önce yaptıgımız gibi +operatörünü kullanabiliriz
        //yada string class dan concat methodunu kullanabiliriz

        String str1="java";
        String str2="candır";

        //java candır yazdıralım
        System.out.println(str1 + " " + str2);//+ method

        String cümle=str1.concat(str2);//böyle bitişik yazar
        System.out.println(cümle);

        cümle=str1.concat(" ").concat(str2);//ayrı yazılır
        System.out.println(cümle);

        //va yazalım
        System.out.println(" "+str1.toUpperCase().charAt(2) + str1.toUpperCase().charAt(3));//böyle yazarsak VA yazar
        System.out.println(str1.charAt(2) + str1.charAt(3));//




    }
}
