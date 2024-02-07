//Write a Java program to count Unicode code points in the specified text range of a string.
import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String str = sc.nextLine();
        System.out.println("Original String: " + str);
        System.out.print("Enter the start index: ");
        int start = sc.nextInt(); 
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();
        
        if (start >= 0 && start<= end && end <= str.length()) {
            int ctr = str.codePointCount(start, end);
            System.out.println("Codepoint count from index " + start + " to " + end + " = " + ctr);
        } else {
            System.out.println("Invalid range.");
        }
        sc.close();
    }
}