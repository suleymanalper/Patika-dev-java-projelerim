public class DizidekiSayilarinHarmonikOrtalamasiniHesaplama {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++){
            sum+=list[i];
        }
        double avarage=sum/list.length;
        System.out.println("Ortalamanız :"+avarage);

        double harmonik=list.length/sum;
        System.out.println("Harmonik ortalama: "+harmonik);

    }
}
