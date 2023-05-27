import java.util.Scanner;

    public class DeseneGoreMetotOlusturma {

        static void kural(int number) {
            System.out.print(number + " ");

            if (number <= 0) {
                return;
            }

            kural(number - 5);

            System.out.print(number + " ");
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("N Sayısı: ");
            int n = scan.nextInt();

            kural(n);
        }
    }
