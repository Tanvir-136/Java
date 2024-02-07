//Write a Java program to concatenate a given string to the end of another string.
import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2= sc.nextLine();
        String str3 = str1.concat(str2);
        System.out.println("The concatenated string: " + str3);
        sc.close();
    }
}