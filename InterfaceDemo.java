// interface I{
//     int no=10;
//     void f();
// }
// class InterfaceDemo implements I{
//     public void f(){
//         no=no+1;     //cannot assign a value to final variable no
//         System.out.println("f called...."+no);
//     }
//     public static void main ( String [] args ){
//         Demo obj= new Demo ();
//         obj.f();

//     }
// }


interface I1{
    int no=10;
    void f();
}
 interface I2{
    int no2=20;
    void g();
 }
 interface I3 extends I1,I2{

 }
 class Base{
    void h(){
        System.out.println(" H called ");
    }
 }
 
class Demo  extends Base implements I3 {
     public void f(){
        //no=no+1;     //cannot assign a value to final variable no
        System.out.println("f called...."+no);
    }
      public void g(){
        //no=no+1;     //cannot assign a value to final variable no
        System.out.println("g called...." +no2);
    }
    public static void main (String [] args ){
        Demo obj= new Demo();
        obj.f();
        obj.g();
        obj.h();

    }
}