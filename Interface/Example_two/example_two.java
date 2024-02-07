interface printable{
    void print();
}
interface showable{
    void show();
}
//Multiple inheritance is not supported in Java but interface support it.....
//it is supported in case of an interface because there is no ambiguity. 
//It is because its implementation is provided by the implementation class
class A implements printable,showable{
    public void print(){
        System.out.println("Hello");
    } 
    public void show(){
        System.out.println("World");
    }
}
public class example_two{
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
    }
}