import java.util.Scanner;
public class addnum{
    public static void main(String [] args){
        int x,y,res;
        Scanner mysc= new Scanner(System.in);
        System.out.println("type a number");
        x=mysc.nextInt();

        System.out.println(" Tpye another number");
        y=mysc.nextInt();
        res=addnumbers(x,y);
        System.out.println(res);
    }
    public static int addnumbers(int a,int b){
        int c= a+b;
        
        // Siyaram s=new Siyaram();
        // s.printSiyaram();

        // ModifiersTest m=new ModifiersTest();
        // m.printHello();
    // }
    //     public static int addnumbers(int a,int b)
    //     {
    //         int c=a+b;
    //         return c;
        

    
        
    }
}