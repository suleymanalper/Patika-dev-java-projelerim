import java.util.Scanner;

public class CiftSayilarinToplami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        System.out.println("Sayı girin (Programı sonlandırmak için 0 girin):");

        do {
            sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi != 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
