package Day19_Dowhıleloop;

public class C02_Whıleloop {
    public static void main(String[] args) {

        //kullanıcıdan pozıtıf bır tam sayı alıp whıle loop ıle sayıdan kuçuk sayıları yazdıralım
        int input=5;
        int sayı=1;

        while(sayı<input){
            System.out.print(sayı);//4 sayı yazdırdım loop 5 kere çalıştı
            sayı++;
        }
        //aynı soruyu do whıle loop ıle yapalım
        sayı=1;
        do {
            System.out.print(sayı);//burda 4sayı yazdırdı loop 4 kere çalıştı do ilk once yap sonra kontrol et
            sayı++;
        }while (sayı<input);

        }
    }

