package Day13_StrıngManıpulatıon;

public class C06_Soru {
    public static void main(String[] args) {

        //kullanıcıdan bir şifre girmesini isteyiniz aşagıdaki şartları saglıyorsa "şifre başarı ile tamamlandı
        //şartları saglamazsa "işlem başarısız,lütfen yeni bir şifre giriniz"
        //ilk harf büyük harf olmalı,son harf küçük harf olamalı,şifre boşluk içermemeli
        //şifre en az 8 karakter olmalı
        String sifre = "Asd1223456";

        boolean ilkharf = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkharf = true;
        } else {
            System.out.println("şifrenin ilk harfi büyük olamlı");
        }
        boolean sonharf = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonharf = true;
        } else {
            System.out.println("son harf küçük olmalı");
        }
            boolean boşluk = false;
            if (!sifre.contains(" ")) {
                boşluk = true;
            } else {
                System.out.println("şifre boşluk içermemeli");
            }
                boolean uzunluk = false;
                if (sifre.length() >= 8) {
                    uzunluk = true;

                } else {
                    System.out.println("şifre en az sekiz karakter olmalı");

                }
                if (ilkharf && sonharf && boşluk && uzunluk) {
                    System.out.println("sifreniz başarılı şekilde kayıtedildi");
                }
            }
        }




