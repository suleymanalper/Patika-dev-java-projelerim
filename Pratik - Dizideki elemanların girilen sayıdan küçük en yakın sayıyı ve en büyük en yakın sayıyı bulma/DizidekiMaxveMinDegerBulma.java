
import java.util.Arrays;

public class DizidekiMaxveMinDegerBulma {
        public static void main(String[] args) {
            int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
            int targetNumber = 5;

            int smallerClosest = Integer.MIN_VALUE;  // Başlangıçta en küçük değeri atıyoruz
            int greaterClosest = Integer.MAX_VALUE;  // Başlangıçta en büyük değeri atıyoruz

            for (int number : numbers) {
                if (number < targetNumber && number > smallerClosest) {
                    smallerClosest = number;
                }
                if (number > targetNumber && number < greaterClosest) {
                    greaterClosest = number;
                }
            }

            System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallerClosest);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + greaterClosest);
        }
    }
