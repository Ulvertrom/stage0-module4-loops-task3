package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int[] fibonacci = new int[lastFibonacci];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int index = 2; index < lastFibonacci; index++) {
            fibonacci[index] = fibonacci[index - 2] + fibonacci[index - 1];
        }
        for (int counter = 0; counter < lastFibonacci; counter++) {
            System.out.println(fibonacci[counter]);
        }
    }
}
