// import java.util.*;


// Abstract methods ko sirf Abstract class mein hi bana sakte ho
class AbstractClass {
     public static void main(String[] args) {
        child ab = new child();
        ab.greet();
    }
    
    
   
}

abstract class AbstractClass2 {
abstract public void greet();
// all the inhetrited classes can use this greet function as they want
}
class child extends AbstractClass2{
    public void sayhello(){
        System.out.println("hello");
    }
    public void greet() {
        System.out.println("good morning");
        
    }
}