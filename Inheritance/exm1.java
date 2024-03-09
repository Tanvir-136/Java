class Animal{
    void makeSound(){
        System.out.print("Animal makes sound!");
    }
}
class cat extends Animal{
    void makeSound(){
        System.out.print("Cat makes sound!");
    }
}
public class exm1{
    public static void main(String[] args) {
        cat obj = new cat();
        obj.makeSound();
    }
}