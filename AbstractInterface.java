interface I1{
    void f();
    // public I1(){
    //     System.out.println("I1 Created")
    // }


}
abstract class Abbase{
    abstract void h();
    public Abbase(){
        System.out.println("Abbase Created");
    }

} 
class Dervied extends Abbase implements I1{
     public void f(){
        System.out.println("F calledd");

    }
    void h(){
        System.out.println("H calledd");
    }
    public static void main(String[] args){
        I1 obj=new Dervied();
        Abbase obj2= new Dervied();
        Dervied obj3= new Dervied();
        // obj2.f();
        ((I1)obj2).f();
        obj2.h();
        obj3.f();
        obj3.h();
    }
}