//Write a Java program to compare a given string to another string, ignoring case considerations
import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String str2 = sc.nextLine();
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println(isEqualIgnoreCase);
        sc.close();
    }
}
