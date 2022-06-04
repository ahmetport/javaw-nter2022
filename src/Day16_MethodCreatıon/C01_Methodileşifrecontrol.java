package Day16_MethodCreatıon;

public class C01_Methodileşifrecontrol {
    public static void main(String[] args) {
        //kullanıcıdan bir şifre girmesini isteyiniz aşagıdaki şartları saglıyorsa "şifre başarı ile tamamlandı
        //şartları saglamazsa "işlem başarısız,lütfen yeni bir şifre giriniz"
        //ilk harf büyük harf olmalı,son harf küçük harf olamalı,şifre boşluk içermemeli
        //şifre en az 8 karakter olmalı
        //bu dört kontrolü method ile yapın
        String sifre = "Asd13453e";
        boolean ilkharf = ilkharfkontrolet(sifre);
        boolean sonharfkontrol = sonharfkontrolet(sifre);
        boolean boslukkontrol = boslukkontrolet(sifre);
        boolean uzunlukkontrol = uzunlukkontrolet(sifre);
        if (ilkharf && sonharfkontrol && boslukkontrol && uzunlukkontrol) {
            System.out.println("şifre başarılı şekilde tanımlandı");
        } else {
            System.out.println("işlem başarısız tekrar deneyin");

        }
    }
        private static boolean uzunlukkontrolet (String sifre){
            boolean uzunluksonuc = false;
            if (sifre.length() >= 8) {
                uzunluksonuc = true;

            } else {
                System.out.println("şifre en az sekiz karakter olmalı");
            }
            return uzunluksonuc;

        }

        private static boolean boslukkontrolet (String sifre){
            boolean bosluksonuc = false;
            if (!sifre.contains(" ")) {
                bosluksonuc = true;
            } else {
                System.out.println("şifre boşluk içermemeli");
            }
            return bosluksonuc;
        }

        private static boolean sonharfkontrolet (String sifre){
            boolean sonharfsonuc = false;
            char sonharf = sifre.charAt(sifre.length() - 1);
            if (sonharf >= 'a' && sonharf <= 'z') {
                sonharfsonuc = true;
            } else {
                System.out.println("son harf küçük olmalı");

            }
            return sonharfsonuc;
        }
        private static boolean ilkharfkontrolet (String sifre){
            char ilkharf = sifre.charAt(0);
            boolean ilkharfsonuc = false;
            if (ilkharf >= 'A' && ilkharf <= 'Z') {
                ilkharfsonuc = true;
            } else {
                System.out.println("şifrenin ilk harfi büyük olamlı");
            }
            return ilkharfsonuc;

        }

    }

