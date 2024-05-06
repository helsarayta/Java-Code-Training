public class BulletAndDragon {
    public static void main(String[] args) {
        int bullet = 2026581867;
        int dragon = 1265497189;

        System.out.println(Integer.MAX_VALUE);

        System.out.println(1265497189*2);
//        System.out.println(Double.valueOf(bullet)/Double.valueOf(dragon));
        boolean res = dragon*2L <= bullet;

        System.out.println(res);
//        if((dragon*2) <= bullet ) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
    }
}
