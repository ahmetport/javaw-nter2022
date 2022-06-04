package Day16_MethodCreatıon;

public class C03_Forloop {
    public static void main(String[] args) {

        //verilen strıngı tersten yazdıran bir kod yazınız
        String str="valla bu java çok zevkli";
        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.substring(i,i+1));


        }
    }

}
