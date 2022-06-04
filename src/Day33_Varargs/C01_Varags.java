package Day33_Varargs;

public class C01_Varags {
    public static void main(String[] args) {
        String str1="ali";
        String str2="abuzittin";
        String str3="oguzhan";
        //yazılan argument sayısı sabitse herzamanki gibi bir method oluşturabiliriz
        //argument sayısının degişme ıhtımali varsa o zaman varargs tercih edilir
        enuzunkelime(str1,str2,str3);


    }

    private static void enuzunkelime(String...str) {
        String enuzunStr="";
        for(String each:str
             ) {
            if(each.length()>enuzunStr.length()){
                enuzunStr=each;
            }

        }
        System.out.println("en uzun kelime:"+ enuzunStr);
    }


}

