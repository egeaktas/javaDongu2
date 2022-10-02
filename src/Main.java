/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sınırı giriniz: ");
        int n;
        int sayac= 0;

        n = input.nextInt();

        for(int i = 1; i<=n; i*=4){
            System.out.println("4^"+sayac+"= "+i);
            sayac++;
        }
        sayac = 0;
        System.out.println("----------");
        for(int j = 1; j<=n; j*=5){
            System.out.println("5^"+sayac+"= "+j);
            sayac++;
        }
    }
}