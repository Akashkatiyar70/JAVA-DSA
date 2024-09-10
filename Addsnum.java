import java.util.Scanner;
public class Addsnum{
    public static void main(String [] args){
        
        // Scanner sc = new Scanner(System.in);
        // int x;
        // System.out.println("please enter the variable value");
        // x=sc.nextInt();
        // int y;
        // System.out.println("please enter the variable value");
        // y=sc.nextInt();
        // int x=10;
        // int y=10;
    
        int x,y,res;
        Scanner mysc= new Scanner(System.in);
        System.out.println("type a number:");
        x=mysc.nextInt();

        System.out.println("type another number:");
        y=mysc.nextInt();
         res = addnumbers(x,y);
        System.out.println(res);

    }
    public static int addnumbers(int a,int b){
        int c=a+b;
        return c;

    }
    }
        
    
