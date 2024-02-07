//Write a Java program to compare a given string to a specified string buffer
public class ten {
    public static void main(String[] args){
        String str = "Hello,World!";
        StringBuffer buffer = new StringBuffer("Hello, World!");
        System.out.println(str.equals(buffer.toString()));
    }
}