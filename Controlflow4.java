public class Controlflow4{
    public static void main (String[] args){
        int a=10;
    //     if(a==10)
    //     {
    //         System.out.println("a==10");
    //         if(a<100)
    //         System.out.println("yes less then 100");
    //         if(a%2==0)
    //         {
    //             System.out.println("even");
    //             if(a>10)
    //             {
    //                 System.out.println("No");
    //             }
    //             else{
    //                 System.out.println("Yes");
    //             }
    //             }
    //         }
    //    }   }
    if(a>10)
    {
        System.out.println("No");
    }
    else{
        System.out.println("Yes");
        {
            System.out.println("yes a gt 2");
            if(a%2!=0)
            {
                System.out.println("odd");
            }
            else{
                System.out.println("Yes");
                if(a==10)
                {
                    System.out.println("The end");
                }

            } 
        }
    }
    }
    }
