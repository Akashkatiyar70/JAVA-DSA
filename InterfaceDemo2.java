interface I{
    static  void f(){
        System.out.println("F called.....");

    }
}
    
class InterfaceDemo2 implements I{
    // public void f(){
    //     System.out.println("F called FromDemo");
    // }
    public static void main(String [] args ){
        // InterfaceDemo2 obj=new InterfaceDemo2();
        // obj.f();
        I.f();
    }
}