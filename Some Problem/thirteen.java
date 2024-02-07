// Write a Java program to check whether two String objects contain the same data.
import java.util.Scanner;
public class thirteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2 = sc.nextLine();
        boolean sameData = str1.equals(str2);
        if (sameData) {
            System.out.println("Both strings contain the same data.");
        } else {
            System.out.println("The strings do not contain the same data.");
        }
        sc.close();
    }
}
