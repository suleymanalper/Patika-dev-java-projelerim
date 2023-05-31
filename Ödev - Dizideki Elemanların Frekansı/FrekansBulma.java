public class FrekansBulma {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frekanslar = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            if (frekanslar[i] == -1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    count++;
                    frekanslar[j] = -1;
                }
            }
            frekanslar[i] = count;
        }

        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < dizi.length; i++) {
            if (frekanslar[i] != -1) {
                System.out.println(dizi[i] + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
            }
        }
    }
}
