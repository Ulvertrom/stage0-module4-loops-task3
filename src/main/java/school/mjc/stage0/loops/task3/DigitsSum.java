package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        int digit;
        int devided = number;
        int lengthNumber = 1;
        while (devided / 10 != 0) {
            devided = devided / 10;
            lengthNumber++;
        }
        for (int counter = 1; counter <= lengthNumber; counter++) {
            devided = number / 10;
            digit = number - devided * 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println(sum >= 0? sum: - sum);
    }
}
