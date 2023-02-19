package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int member = 0;
        for (int counter = 1; counter <= lengthOfLastNumber; counter++) {
            member = 10 * member + 9;
            sum += member;
        }
        System.out.println(sum);
    }
}
