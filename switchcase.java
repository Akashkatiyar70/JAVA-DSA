import java.util.*;
public class switchcase{    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int variable;
        System.out.println("please enter the variable value");
        variable=sc.nextInt();
        switch(variable)
        {
            case 10:
            System.out.println("yes x=10");
            break;
            case 9:
            System.out.println("yes x=9");
            break;

            case 8:
            System.out.println("yes x=8");
            break;

            case 7:
            System.out.println("yes x=7");
            break;
            case 6: 
            System.out.println("yes x=6");
            break;

            case 5:
            System.out.println("yes x=5");
            break;

            default:
            System.out.println(" this defult");

        }
    }
}