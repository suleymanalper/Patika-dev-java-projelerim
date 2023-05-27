import java.util.Scanner;

    public class RecursiveAsalSayıBulma {

        static boolean isPrime(int number, int divisor) {
            if (divisor == 1) {
                return true;
            } else if (number % divisor == 0) {
                return false;
            } else {
                return isPrime(number, divisor - 1);
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayı Giriniz: ");
            int number = scan.nextInt();

            boolean isPrime = isPrime(number, number / 2);

            if (isPrime) {
                System.out.println(number + " sayısı ASALDIR !");
            } else {
                System.out.println(number + " sayısı ASAL değildir !");
            }
        }
    }
