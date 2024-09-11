public class ConstructerCallDemo{
    public static void main (String [] args){
        Derived dobj=new Derived(10,20);
        // Base bobj=new Base();
        dobj.printIJ();
    }}
 class Base{
    protected int i;
    public Base(){
        System.out.println("Base  Default constructor Called");
        i=15;
    }
    public Base(int i){
        System.out.println("Base parameterized constructor Called");
        this.i=i;

    }
    public void printI(){
        System.out.println(i);
    }
}

class Derived extends Base{
  
    int j;
    public Derived(int i,int j){
         super(i);
        System.out.println("Derived Constructer called");
        //super(i) //call to super must be first statement in constructor

      this.j=j;
    }
    public void printIJ(){
        System.out.println("I:"+i);
        System.out.println("J:"+j);

    }
}
    