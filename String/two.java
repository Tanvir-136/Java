// Write a Java program to get the character (Unicode code point) 
//at the given index within the string.

import java.util.Scanner;
public class two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.print("Input the nummber of index: ");
        int index = sc.nextInt();
        if (index >= 0 && index < text.length()) {
            int codePointAtIndex = text.codePointAt(index);
            System.out.println("Unicode code point at index " + index + " is: " + codePointAtIndex);
        } else {
            System.out.println("Index out of bounds.");
        }
        sc.close();
    }
}
