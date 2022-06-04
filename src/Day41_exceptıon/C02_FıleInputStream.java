package Day41_exceptıon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FıleInputStream {
    public static void main(String[] args){
        //bir kod yazılırken olası exceptıonlar öngörülüp exceptıon oluştugunda javanın ne yapmasını istedigimiz belirtilmelidir
       // 1-eger exceptıon oluştugunda kodun çalışmasını istemiyorsak method isminin yanına oluşabilecek exceptıon deklare edebiliriz
        //kodun çalışmasını istiyorsak sorun oluşturabilecek kodu try catch ın içine alır try bloguna sorun çıkabilecek kodu
        //catch bloguna oluşabilecek exceptıonı ve olası exceptıon durumunda javanın ne yapması istedigimizi yazabiliriz

        String dosyayolu="src/Day41_exceptıon/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }


    }


    }



