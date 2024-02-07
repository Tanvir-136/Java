//Write a Java program to get the character at the given index within the string
import java.util.Scanner;
public class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = sc.nextLine();
        System.out.print("Input the number of index you want to show: ");
        int index = sc.nextInt(); 
        if (index >= 0 && index < text.length()) {
            char characterAtIndex = text.charAt(index-1);
            System.out.println("Character at index " + index + " is: " + characterAtIndex);
        } else{
            System.out.println("Index out of bounds.");
        }
        sc.close();
    }
}
