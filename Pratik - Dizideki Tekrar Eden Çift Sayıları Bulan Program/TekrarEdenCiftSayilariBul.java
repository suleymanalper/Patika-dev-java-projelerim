import java.util.*;

public class TekrarEdenCiftSayilariBul {

    public static void main(String[] args) {
        int[] dizi = {2, 4, 6, 8, 4, 9, 2, 6, 4, 2};
        List<Integer> tekrarEdenCiftSayilar = tekrarEdenCiftSayilariBul(dizi);

        System.out.println("Tekrar Eden Çift Sayılar:");
        for (int sayi : tekrarEdenCiftSayilar) {
            System.out.println(sayi);
        }
    }

    public static List<Integer> tekrarEdenCiftSayilariBul(int[] dizi) {
        List<Integer> tekrarEdenCiftSayilar = new ArrayList<>();
        Map<Integer, Integer> sayiFrekanslari = new HashMap<>();

        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                if (sayiFrekanslari.containsKey(sayi)) {
                    sayiFrekanslari.put(sayi, sayiFrekanslari.get(sayi) + 1);
                } else {
                    sayiFrekanslari.put(sayi, 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : sayiFrekanslari.entrySet()) {
            if (entry.getValue() > 1) {
                tekrarEdenCiftSayilar.add(entry.getKey());
            }
        }

        return tekrarEdenCiftSayilar;
    }
}
