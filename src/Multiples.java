public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total++;
            }
        }
        System.out.println("Total number of multiples of 3 and 5 below 1000 = " + total);
    }
}
