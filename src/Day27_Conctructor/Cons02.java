package Day27_Conctructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1=new Cons01();    //default constructor devrede
        //Cons01 classında hiç consructur oluşturmazsak java default cons kullandıgından obj1 üretebildik
        //ancak biz parametreli veya parametresız bir cons yazdıgımızda java default constructur ı siler
        //dolayısıyla biz herhangı bir cons oluşturdugumuzda daha önce başka classlar veya kullanıcıların
        //oluşturmuş olabilecegi objeleri kullanabilmeleri için default cons un işleyişini gerçekleştirecek
        //parametresiz bir cons oluşturmakta fayda var

        Cons01 obj2=new Cons01("java");




    }
}
