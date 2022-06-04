package Lambda;


    import java.io.IOException;
import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
    import java.util.stream.Stream;

public class Lambda06 {

        public static void main(String[] args) throws IOException {
            //TASK 01 --> haluk.txt dosyasini okuyunuz.(Console'a yazdiriniz)
            Path haluk=Path.of("src/Lambda/hlk.txt");
            Stream<String>akıs=Files.lines(haluk);//haluk dosyasını buraya assıgn ettik

            System.out.println("\n*** haluk.txt dosyasini okuyunuz -->  ");
            Files.lines(Paths.get("src/Lambda/hlk.txt")).//files classdaki lines ile dosya yolunu path edip parametre girilerek
                    //path deki dosyanın dataları akışa alındı
                    forEach(System.out::println);//akışdaki her satırdaki string ifade yazıldı

            //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
            System.out.println("\n*** haluk.txt dosyasini buyuk harflerle okuyunuz -->  ");
            Files.lines(Paths.get("src/Lambda/hlk.txt")).
                    map(String::toUpperCase).
                    forEach(System.out::println);


            //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle yazdiriniz.
            System.out.println("\n*** haluk.txt dosyasindaki ilk satiri kucuk harflerle okuyunuz 01 -->  ");

            Files.lines(Paths.get("src/Lambda/hlk.txt")).limit(1).
                    map(String::toLowerCase).
                    forEach(System.out::println);


            //TASK 04 --> haluk.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz yazdiriniz
            System.out.println("\n*** haluk.txt dosyasinda basari kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
            System.out.println(Files.lines(haluk).
                    map(String::toLowerCase).
                    filter(t->t.contains("basari")).count());


            //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz.
            System.out.println("\n*** haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");
            System.out.println(Files.lines(haluk).
                    map(t->t.split(" ")).
                    flatMap(Arrays::stream).//flatmap ile arraye dönen akışı tekrar stream çeviriyorum
                             distinct().
                    collect(Collectors.toList()));
            //2 yol ile
            System.out.println(Files.lines(haluk).
                    map(t->t.split(" ")).
                    flatMap(Arrays::stream).//flatmap ile arraye dönen akışı tekrar stream çeviriyorum
                             collect(Collectors.toSet()));//daha clean kod oldu distinc çıktı set hep elemanları unıqe yapar hemde yazdırır


            //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz.
            System.out.println("\n*** haluk.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");
            Files.lines(haluk).map(t->t.split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::print);


            //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız yaziniz.
            System.out.println("\n*** haluk.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");
            System.out.println(Files.lines(haluk).
                    map(t->t.split(" ")).
                    flatMap(Arrays::stream).
                    filter(t->t.equalsIgnoreCase("basari")).
                    count());


            //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini ekrana yazdiran programi yaziniz
            System.out.println("\n*** haluk.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
            System.out.println( Files.lines(haluk).
                    map(t->t.split(" ")).
                    flatMap(Arrays::stream).
                    filter(t->t.contains("a")).
                    count());


            //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri yazdiriniz
            System.out.println("\n*** haluk.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");

             Files.lines(haluk).
                    map(t->t.split(" ")).
                    flatMap(Arrays::stream).
                    filter(t->t.contains("a")).forEach(System.out::print);

             //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini yazdiriniz
            System.out.println("\n*** haluk.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");
            System.out.println( Files.lines(haluk).
                    map(t->t.replaceAll("\\W","").
                            replaceAll("\\d","").
                            split("")).//harf oldugu için hiçlik böyle alınır
                    flatMap(Arrays::stream).
                    distinct().
                    count());

            //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini yazdiriniz
            System.out.println("\n*** haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

            System.out.println( Files.lines(haluk).
                    map(t->t.replaceAll("[.!,:)\\-]","").//bu işaretleri görünce hiçlik yap

                            split(" ")).//kelime oldugu için buna dikkat trick burda
                            flatMap(Arrays::stream).
                    distinct().
                    count());

        }
    }

