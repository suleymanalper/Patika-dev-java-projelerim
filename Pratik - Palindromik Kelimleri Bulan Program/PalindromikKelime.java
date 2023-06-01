import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        if (isPalindromik(kelime)) {
            System.out.println(kelime + " bir palindromik kelimedir.");
        } else {
            System.out.println(kelime + " bir palindromik kelime değildir.");
        }
    }

    public static boolean isPalindromik(String kelime) {
        int baslangic = 0;
        int bitis = kelime.length() - 1;

        while (baslangic < bitis) {
            if (kelime.charAt(baslangic) != kelime.charAt(bitis)) {
                return false;
            }
            baslangic++;
            bitis--;
        }
        return true;
    }
}
