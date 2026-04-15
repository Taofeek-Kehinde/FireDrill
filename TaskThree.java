

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0;
        double average = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int number = inputCollector.nextInt();
            sum += number;
        }


        average = (double) sum / 10; 

        System.out.println("sum is: " + sum);
        System.out.println("Average is: " + average);
        

    }
}


