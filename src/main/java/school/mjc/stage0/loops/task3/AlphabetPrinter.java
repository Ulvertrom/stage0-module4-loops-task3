package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char letter;
        for (int counter = 0; counter < 26; counter++) {
            letter = (char) (97 + counter);
            System.out.println(letter);
        }
    }
}
