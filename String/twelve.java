// Write a Java program to check whether a given string ends with another string.
import java.util.Scanner;
public class twelve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2 = sc.nextLine();
        boolean endsWith = str1.endsWith(str2);
        if (endsWith) {
            System.out.println("The main string ends with the specified string.");
        } else {
            System.out.println("The main string does not end with the specified string.");
        }
        sc.close();
    }
}