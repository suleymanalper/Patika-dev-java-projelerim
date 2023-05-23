import java.util.Scanner;

public class UsluSayiHesaplama {
    public static int usluSayi(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc = usluSayi(taban, us);
        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}

