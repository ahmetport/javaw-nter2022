package Day09_Ternaryswıtch;

public class C07_Nestedifi {
    public static void main(String[] args) {

        //kullanıcıdan bir tam sayı alın sayı 10 dan küçükse "rakam" yazdırın
        //100 den küçükse"iki basamaklı sayı" degilse "üç basamaklı veya daha büyük sayı" yazdırın
        int sayı=180;

        if (sayı>=0){
            if (sayı<10){
                System.out.println("rakam");//soruyu if else çözdük çünkü böyle daha anlaşılır oldu
            }else if (sayı<100){
                System.out.println("iki basamaklı sayı");


            }else{
                System.out.println("üç basamaklı ve daha büyük sayı");

            }
        }
    }
}
