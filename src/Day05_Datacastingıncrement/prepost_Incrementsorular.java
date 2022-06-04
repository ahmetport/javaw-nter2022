package Day05_Datacastingıncrement;

public class prepost_Incrementsorular {
    public static void main(String[] args) {
        int sayı1=10;
        int sayı2=20;
        int sayı3=30;

        sayı2=sayı1++;
        System.out.println(sayı1 + ", " + sayı2 + ", "+ sayı3);//11,10,30  ilk önce atadı sonra sayıyı arttırdı


        sayı3= ++sayı1;
        System.out.println(sayı1 + ",  "+ sayı2 + ", "+ sayı3);//12,20,12  yani ilk önce sayı arttırdı sonra atama yaptı

        System.out.println((--sayı2));//9
        System.out.println(sayı1++);//12
        System.out.println(sayı1);//13





    }
}
