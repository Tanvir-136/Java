//Write a Java program to compare a given string to the specified character sequence
public class nine{
    public static void main(String[] args) {
        String str1 = "example.com", str2 = "Example.com";
        CharSequence cs = "example.com";
        System.out.println(str1.contentEquals(cs));
        System.out.println(str2.contentEquals(cs));
    }
}