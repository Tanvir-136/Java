abstract class bike{
    //Constructor
    bike(){
        System.out.println("Bike is created!");
    }
    //abstract Method
    abstract void run();

    void changeGear(){
        System.out.println("Gear Changed!");
    }
}
class honda extends bike{
    void run(){
        System.out.println("Running safely!");
    }
}
class Abstract{
    public static void main(String[]args){
        bike obj = new honda(); // Cannot Instantiated "bike()" because it is abstract class
        obj.run();
        obj.changeGear();
    }
}



//Rule: If there is an abstract method in a class, that class must be abstract.
/*Rule: If you are extending an abstract class that has an abstract method, 
you must either provide the implementation of the method or make this class abstract*/