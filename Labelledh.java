public class labelled_break{
    public static  void main (String[] args){
        out:
        for(int i=1; i<=100; i++){
            System.out.println("outer");
            for(int j=1; j<=100; J++){
                System.out.println("inner");
                if(j==2)
                break out;
            }
        }
    }        
    }
