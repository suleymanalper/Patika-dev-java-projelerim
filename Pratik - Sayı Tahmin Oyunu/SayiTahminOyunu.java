import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int rand=random.nextInt(100);
        Scanner scanner=new Scanner(System.in);
        int right=0;
        while(right<5){
            System.out.print("0 ile 100 arasında bir sayı giriniz: ");
            int sayi=scanner.nextInt();

            if (rand>sayi){
                System.out.println("Daha yüksek bir sayı giriniz. Kalan hakkınız: "+(4-right));
            }else if (rand<sayi){
                System.out.println("Daha düşük bir sayı giriniz.Kalan hakkınız: "+(4-right));
            }else {
                System.out.println("Tebrikler sayıyı buldunuz. "+right +" . defada buldunuz");
                break;
            }
            right++;

        }
        if (right==5){
            System.out.println("Tahmin hakkınız bitti. Doğru sayı : "+rand);
        }
    }
}
