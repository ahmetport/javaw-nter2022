package Day18_Nestedforloop;

public class C02_Nestedforloop2 {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir rakam girmesini isteyin ve girilen rakama göreaşagıdaki şekli yazdırın
        //*
        //**
        //***
        //****
        int input=5;


        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i; j++) {//input olursa dikdörtgen formatında olabilir veyaüçgen olabilir
                System.out.print("* ");   //üçgen olursa input yerine i olur

            }
            System.out.println("");

        }

    }
}
