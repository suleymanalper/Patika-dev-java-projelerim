import java.sql.SQLOutput;
import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        System.out.println("Üçgen için üç kenar girin: ");
        Scanner tara=new Scanner(System.in);
        System.out.print("ilk kenar: ");
        int a=tara.nextInt();
        System.out.print("İkinci kenar: ");
        int b=tara.nextInt();
        System.out.print("Üçüncü kenar: ");
        int c=tara.nextInt();
        int u=((a+b+c)/2);
        System.out.println("Üçgenin çevresi: "+ 2*u);
        int AlanınKaresi=u*(u-a)*(u-b)*(u-c);
        System.out.println("üçgenin alanı: "+ Math.sqrt(AlanınKaresi));

    }
}
