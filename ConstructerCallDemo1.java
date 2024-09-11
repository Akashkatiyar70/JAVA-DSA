 public class ConstructerCallDemo1{
    public static void main(String[] args){
        C cobj=new C(10);
    }
 }
class A{
    public  A( int i){
        i=10;
        System.out.println("A constructer called");
    }
}
class B extends A{
    public B(int j){
        super(10);

        j=10;
        System.out.println("B construter called");
    }
}
class C extends B{
    public C(int k){
        super(10);
        k=10;
        System.out.println("C construter called");
    }
}