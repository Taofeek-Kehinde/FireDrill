import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0;
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int number = inputCollector.nextInt();
            
            
            if (i % 2 == 0) {
                sum += number;
            }
        }
        
        
        System.out.println("Sum of even indexes (2nd, 4th, etc.) is: " + sum);
    }
}

use this code to 
print sum of only even numbers in the in the collected scores
