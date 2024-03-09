import java.util.Scanner;

class Rectangle{
    int length,width;
    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    double getArea(){
        return length*width;
    }
    double getPerimeter(){
        return 2*(length+width);
    }
}
class Square extends Rectangle{
    Square(int side){
        super(side,side);
    } 
    double getPerimeter(){
        return 4*super.length;
    }
}
// public class exm5{
//     public static void main(String[] args) {
//         Rectangle rectangle = new Rectangle(3, 5);
//         System.out.println("Area of rectangle: "+ rectangle.getArea());
//         System.out.println("Perimeter of rectangle: "+ rectangle.getPerimeter());
//         Square square = new Square(6);
//         System.out.println("Area of square: "+ square.getArea());
//         System.out.println("Perimeter of square: "+ square.getPerimeter());
//     }
// }

//use array of object
// public class exm5 {
//     public static void main(String[] args) {
//         Square[] squares = new Square[15];
//         for (int i = 0; i < squares.length; i++) {
//             squares[i] = new Square(i + 1);
//         }
//         for (int i = 0; i < squares.length; i++) {
//             System.out.println("Area of square " + (i + 1) + ": " + squares[i].getArea());
//         }
//     }
// }

public class exm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Square[] square = new Square[15];
        for (int i = 0; i <square.length; i++) {
            System.out.print("Enter side length for square " + (i ) + ": ");
            int sideLength = scanner.nextInt();
            square[i] = new Square(sideLength);
        }
        for (int i = 0; i < square.length; i++) {
            System.out.println("Area of square " + (i + 1) + ": " + square[i].getArea());
        }

        scanner.close();
    }
}
