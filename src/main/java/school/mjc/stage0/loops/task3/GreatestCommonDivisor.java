package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int GCD = 1;
        for (int divider = 1; divider <= first; divider++) {
            if (first % divider == 0 && second % divider == 0) {
                GCD = divider;
            }
        }
        System.out.println(GCD);
    }
}
