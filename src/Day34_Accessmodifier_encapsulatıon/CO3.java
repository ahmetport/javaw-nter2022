package Day34_Accessmodifier_encapsulatıon;

public class CO3 {
    //ENCAPSULE edecegimiz iki variabler olsun
    private  int sayı;
    private String str;

    public int getSayı() {
        return sayı;
    }

    public void setSayı(int sayı) {
        this.sayı = sayı;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "CO3{" +
                "sayı=" + sayı +
                ", str=" + str ;

    }
}


