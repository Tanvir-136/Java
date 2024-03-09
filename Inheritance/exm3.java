class shape {
    double getArea() {
        return 0.0;
    }
}
class rectangle extends shape{
    double length,width;
    public rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea() {
        return length*width;
    }
}
public class exm3{
    public static void main(String[] args) {
        rectangle obj_rec = new rectangle(5, 4);
        double result = obj_rec.getArea();
        System.out.print("Result: "+result);
    }
}