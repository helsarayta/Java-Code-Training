public class GrowthOfPopulation {
    public static void main(String[] args) {
        int p0 = 1500000;
        double percent = 0;
        int aug = 10000;
        int p = 2000000;

        int year = 0;
        while(p0 <= p) {
            p0 = (int) (p0+(percent/100*p0)+aug);
            year++;

        }
        System.out.println(p0);
        System.out.println(year);
    }
}
