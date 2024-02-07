interface drawable{
    void draw();
}
class rectangle implements drawable{
    /*Interface fields are public, static and final by default, 
    and the methods are public and abstract.*/
    public void draw(){
        System.out.println("Drawing Rectangle!");
    }
}
class circle implements drawable{
    /*Interface fields are public, static and final by default, 
    and the methods are public and abstract.*/
    public void draw(){
        System.out.println("Drawing circle!");
    }
}
public class example_one {
    public static void main(String[]args){
        drawable obj = new circle(); 
        obj.draw();
    }
}
