package Day23_Multıdımensıonelarrays;

public class C02_Mdarrays {
    public static void main(String[] args) {
        //verilen multı arrayın tum elementlerının toplamını bulunuz
        int arr[][]={{3,1,7},{6,10,2}};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {//outer array 2 dir burda
            for (int j = 0; j <arr[i].length ; j++) {//i=0 oldugundan burda lengh 4 olur
                toplam+=arr[i][j];


            }

        }
        System.out.println("arraydeki elementlerın toplamı:" +toplam);
    }
}
