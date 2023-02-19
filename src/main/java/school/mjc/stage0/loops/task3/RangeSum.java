package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        if (firstBoarder <= secondBoarder) {
            for (int counter = firstBoarder; counter <= secondBoarder; counter++) {
                sum += counter;
            }
        } else {
            for (int counter = secondBoarder; counter <= firstBoarder; counter++) {
                sum += counter;
            }
        }
        System.out.println(sum);
    }
}
