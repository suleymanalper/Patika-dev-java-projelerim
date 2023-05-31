import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin boyutu n:");
        int n=scanner.nextInt();
        int[] dizi=new int[n];
        System.out.print("Dizinin elemanlarını giriniz: ");

        for (int i=0; i<n;i++){
            System.out.println((i+1)+ ". Elemanı: ");
            dizi[i]=scanner.nextInt();
        }
        Arrays.sort(dizi);

        System.out.print("Sıralama: ");
        for (int eleman:dizi){
            System.out.print(eleman+ " ");
        }
    }
}
