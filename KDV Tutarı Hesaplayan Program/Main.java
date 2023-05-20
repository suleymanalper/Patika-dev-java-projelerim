import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Ücret tutarını giriniz: ");
        Scanner tara=new Scanner(System.in);
        int para=tara.nextInt();
        System.out.println("Kdv'siz Fiyat= "+ para);
        double Kdv=para*0.18;
        System.out.println("Kdv'li Fiyat= "+ (Kdv+para));
        System.out.println("Kdv tutarı= "+Kdv);

    }
}
