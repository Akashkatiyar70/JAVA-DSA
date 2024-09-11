class Base{
    // public Base(){
    //     System.out.println("Basr created");
    // }
    protected void print(){
        System.out.println("Hello form base"); 
    }
}
class Derived extends Base{
    // public Derived(){
    //     System.out.println("Drived created");
    // }
    protected void print(){  // methodoverriding
        System.out.println("Hello form Drived");

    }
}
class OverRidingDemo{
    public static void main(String[] args){
        Base b= new Derived();
        // Derived d= new Derived();

        b.print();
        // d.print();
    }
}