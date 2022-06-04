package Day35_Inherıtance;

public class işçi extends personel{
    public static void main(String[] args) {
        işçi objişçi=new işçi();
        objişçi.isim="hüseyin";
        objişçi.soyisim="efe";
        objişçi.adres="konya";
//önceden obj oluştutrurken personel classının ismini kullanarak personelin constructurun
        //kullanarak işçiye obj oluşturuyordum ama extends chıld classla birlikte
        //işçi obj sini kullanarak işçi üretiyorum çünkü işçi constructorundan oluşturdum
        //yani artık kendi classımdan oluşturuyorum diger classdan isim kullanmıyorum
        //sadece verilerini kullnıyorum




    }




}
