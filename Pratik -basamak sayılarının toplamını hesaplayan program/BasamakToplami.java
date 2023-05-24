import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int tempSayi = sayi;
        String basamaklar = "";

        while (tempSayi != 0) {
            int basamak = tempSayi % 10;
            toplam += basamak;
            basamaklar = basamak + " + " + basamaklar;
            tempSayi /= 10;
        }

        basamaklar = basamaklar.substring(0, basamaklar.length() - 3); 

        System.out.println(sayi + " = " + basamaklar + " = " + toplam);
    }
}
