class FinalDemo2{
    public static void main (String args []){
        Derived d1= new Derived();
        // Derived d2=new Derived();

        d1.print(); 
        // System.out.println("B2......");
        // d2.print();

    }
}
  class Base{


    Base(){
        System.out.println("Base Created"); 

     }
      final public void print(){

        System.out.println("Hello From Base");
     }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived Created");}
        // public void print(){
        // System.out.println(" Hello Derived Created");


    // }

}