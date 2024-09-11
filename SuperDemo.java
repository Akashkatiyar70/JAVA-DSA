public class SuperDemo{
public static void main (String [] args){
    Derived  obj=new Derived();
    obj.printj();
}
}
class Base{
     private int i;
    Base(){
        i=10;
    }
   public void  printi(){
        System.out.println(i);
    }
}
class Derived extends Base{
    private int j;
    Derived(){
    // super.i=20;
     super();//base class constucter called
        this.j=30;

        
    }
    public void printj(){
        super.printi();
        System.out.println(j);

    }
}