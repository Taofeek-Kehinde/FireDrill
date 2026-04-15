import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int number = inputCollector.nextInt();
            sum += number; 
        }

        
        double average = (double) sum / 10; 
        System.out.println("Average is: " + average);
        
        i
    }
}

