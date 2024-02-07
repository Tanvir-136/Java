//Write a Java program to compare two strings lexicographically, ignoring case differences.
import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0){
            System.out.println("\"" + str1 + "\"" +" is less than " +"\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" +" is equals to " +"\"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\"" +" is greater than " +"\"" + str2 + "\"");
        }
        sc.close();
    }
}