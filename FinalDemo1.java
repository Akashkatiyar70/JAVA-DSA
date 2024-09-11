class FinalDemo1{
    public static void main (String args []){
        Derived d1= new Derived();
        Derived d2=new Derived();

        // Base b1= new Base(10,20);
        // Base b2= new Base(11,22);
        // b1.print();
        // System.out.println("B2......");
        // b2.print();

        d1.print();
        System.out.println("B2......");
        d2.print();

    }
}
  class Base{

    //  protected  final int f_i;
    // //  protected  final int f_i=10
    //  protected int j;{
        // f_i=10;
        // j=20;
    //  }
    //  Base(int f_i,int j){
        Base(){
        System.out.println("Base Created"); 
        // f_i=f_i*10; //variable f_i might not have been initialized
        // j=j*10;
        // this.f_i=f_i;
        // this.j=j;
     }
     public void print(){
        // f_i=20; // error: cannot assign a value to final variable f_i
        // System.out.println(f_i);
        System.out.println("Hello From Base");
     }
}
class Derived extends Base{

}