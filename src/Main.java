import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number greater than zero");
        int inputNumber = input.nextInt();
        int counter = 0;
        int total = 0;
        float avg;

        for (int i = 0; i <= inputNumber; i++) {
            if (i % 3 == 0 & i % 4 == 0) {
                counter++;
                total += i;


            }

            if (i == inputNumber) {
                avg = total / counter;
                System.out.println("The average of the numbers that can be divided by 3 and 4 is "
                        + avg);
            }
        }
    }
}
