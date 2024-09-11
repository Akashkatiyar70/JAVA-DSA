 import java.util.Scanner;
class BuiltinPackage{

    public static void main(String [] args){
        System.out.println("Please Enter your name");
        // java.util.Scanner sc= new java.util.Scanner(System.in);
    Scanner sc= new Scanner(System.in);

        String my_name=sc.next();
        System.out.println("Hello...."+my_name);

    }
}