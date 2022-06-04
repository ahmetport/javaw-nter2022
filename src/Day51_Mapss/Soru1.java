package Day51_Mapss;

import Day49_Maps.C02_MapOluştur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Soru1 {

    //verilen map te istenen proglama diline bilen kişileri list olarak döndüren bir method yazınız

    public static void main(String[] args) {
        Map<Integer, String> sınıfMap = C02_MapOluştur.myMap();
        String istenendil = "Dev";
        List<String> istenendilibilenler = istenendilibilenlerlistesioluştur(sınıfMap, istenendil);
        System.out.println(istenendilibilenler);
    }

    private static List<String> istenendilibilenlerlistesioluştur(Map<Integer, String> sınıfMap, String istenendil) {

        List<String> istenendilibilenler = new ArrayList<>();
        Collection<String> sınıfvaluecoll = sınıfMap.values();
        List<String> sınıfvaluelist = new ArrayList<>();
        sınıfvaluelist.addAll(sınıfvaluecoll);
        int outerarrayboyut = sınıfvaluelist.size();
        String ilkvalue = sınıfvaluelist.get(0);

        String ilkvalueArray[] = ilkvalue.split(", ");
        int innerArrayboyut = ilkvalueArray.length;

        String valueMDarr[][] = new String[outerarrayboyut][innerArrayboyut];
        for (int i = 0; i < outerarrayboyut; i++) {
            String temp[] = sınıfvaluelist.get(i).split(", ");//temp bir arraye atıyorum string arraye çevirdim
            for (int j = 0; j < innerArrayboyut; j++) {

                valueMDarr[i][j] = temp[j];//
            }
        }
        for (int i = 0; i < outerarrayboyut; i++) {
            if(valueMDarr[i][2].equals(istenendil)){
                istenendilibilenler.add(valueMDarr[i][0]);
            }

        }

            return istenendilibilenler;

        }

    }



