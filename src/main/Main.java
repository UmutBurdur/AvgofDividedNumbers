package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number greater than zero");
        int inputNumber = input.nextInt();
        int counter = 0;
        int total = 0;
        int avg;

        for (int i = 0; i <= inputNumber; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                counter++;
                total += i;
            }
            if (i == inputNumber && total!=0) {
                counter--;
                avg = total / counter;
                System.out.println("The average of the numbers that can be divided by 3 and 4 is "
                        + avg);
            }
        }
        if (total == 0){
            System.out.println("There is no number that can be divided by 3 and 4");
        }
    }
}
