import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        int n = tara.nextInt();
        for (int i = 1; i <= n; i *= 4)
            System.out.println(i);
        System.out.println("********************************************");
        for (int i = 1; i <= n; i *= 5)
            System.out.println(i);
    }
}
