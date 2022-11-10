
import java.util.Scanner ;
public class Plus {
    public static void main(String[] Args){
        int n;
        int total=0;
        Scanner input = new Scanner(System.in);
        do {
         System.out.println("Sayı giriniz:");
         n = input.nextInt();
         if(n % 2 == 1){
             total += n ;

         }

        }while(n>0);
        System.out.println("toplam: " +total );




    }
}
