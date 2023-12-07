//Write a Java program to create a String object with a character array.
public class eleven {
    public static void main(String[] args) {
        char[] arr_num = { '1', '2', '3', '4' };
        String str = String.copyValueOf(arr_num, 1, 3);
        System.out.println("The book contains " + str + " pages.");
    }
}