public class DistanceFuel {
    public static void main(String[] args) {
        int distance = 100;
        int fuelPerMile = 30;
        int gallonLeft = 4;

        boolean res = (fuelPerMile*gallonLeft) >= distance;
        System.out.println(res);
    }
}
