package Day04_Wrapperandmodules;

public class Wrapperclass {
    public static void main(String[] args) {

        //primitive data türleri için bazı methodlar gerek oldugundan java çözüm oluşturmuştur
        //primitivleri non primitiv olarak kullanabilmek için özel classlar oluşturmuştur
        //onada Wrapperclass demiş

        double sayı=10.5;// sayı dedigimde buraya hiç method gelmez

        Double sayı1=10.5;
        sayı1.doubleValue();//sayı1 dedigimde bir sürü method geliyor en önemlisi buda wrapper classdır



    }
}
