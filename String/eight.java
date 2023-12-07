//Write a Java program to test if a given string contains the specified sequence of char values.
import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2= sc.nextLine();
       
        System.out.println(str1.contains(str2));
        sc.close();
    }
}