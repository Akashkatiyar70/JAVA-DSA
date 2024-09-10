import java.util.Scanner;
public class switchprog{
    public static void main (String [] args){
        Scanner Scanner = new Scanner(System.in);
        String result=null;
        int x=Scanner.nextInt();
        if(x>10)
        System.out.println("Invalid input");
        else{
            switch(x){
                case 1:
                result="1";
                break;

                case 2:
                result="2";
                break;
                
                case 3:
                result="3";
                break;

                case 4:
                result="4";
                break;

                case 5:
                result="5";
                break;

                case 6:
                result="6";
                break;

                case 7:
                result="7";
                break;

                case 8:
                result="8";
                break;

                case 9:
                result="9";
                break;

                case 10:
                result="10";
                break;

            }
            System.out.println("your result for input" + x +"is ="+ result);
        }
    }
}