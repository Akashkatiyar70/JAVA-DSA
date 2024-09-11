final abstract class Base{
    abstract public void f();
    final public void g(){
        System.out.println("g() called....");
    }
    public void h(){
        System.out.println("h from Base callsd....");

    }
}
//  class Derived extends Base{
//     public void f(){
//         System.out.println("F called....");

//     }
//     public void h(){
//         System.out.println("h from base called.....");

//     }
//  }
 class AbstractFinal{
    public static void main (String [] args){
        // Derived obj = new Derived();
        // obj.f();
        // obj.g();
        // obj.h();
    }

 }