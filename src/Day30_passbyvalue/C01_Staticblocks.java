package Day30_passbyvalue;

public class C01_Staticblocks {
    static {    //claas  çalışmaya başlamadan önce yapmamız gereken ön hazırlıklar için kullanılır:
        System.out.println("static block çalıştı");  //ilk önce çalıştı
    }
    static {
        System.out.println("static block2 çalıştı"); //blok birden fazla olursa bloklar yukardan aşagıya dogru sırayla çalışır
    }

    public C01_Staticblocks() {
        System.out.println("cons çalıştı"); //son çalışır
    }

    public static void main(String[] args) {
        System.out.println("main method başlangıcı"); //ikinci çalışır
        C01_Staticblocks obj1;
        new C01_Staticblocks ();

    }
}

