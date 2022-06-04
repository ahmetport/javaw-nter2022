package Day18_Nestedforloop;

public class C02_Whıleloopsoru {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın
        int input=852;
        int rakam=0;
        int rakamlartoplamı=0;

        while (input>0){
            rakam=input%10;
            rakamlartoplamı+= rakam;
            input/=10;

        }
        System.out.println(rakamlartoplamı);

    }
}
