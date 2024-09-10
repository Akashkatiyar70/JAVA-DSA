class Controlflow6{
    public static void main (String [] args){
        int a=90;
        if(a>=100)
        {
            System.out.println("Excellent");
        }
        else if(a>=70)
        {
            System.out.println("Good job");
            if(a==90)
            {
                System.out.println("Yes 90");
                if(a<100)
                {
                    System.out.println("less then 100");
                }
                else if(a>120)
                {
                    System.out.println("gt 120");
                }
                else if(a<10){
                System.out.println("ls 10");
                }
                else if(a==90){
                    System.out.println("Yes == 90");
                    
                }
                else{

                }

            }
        }
        
    }
}