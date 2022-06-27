import java.util.Arrays;
import java.util.Scanner;

public class YakinEnKucukveEnBuyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] list = {15,12,788,1,-1,-778,2,0};
        int n;
        System.out.print("Sayıyı giriniz : ");
        n = input.nextInt();
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++){
            if (n <= list[i]){
                System.out.println("Girilen sayıya yakın en küçük sayı : " + list[i-1]);
                System.out.println("Girilen sayıya yakın en büyük sayı : "+ list[i]);
                break;
            }
        }




    }
}
