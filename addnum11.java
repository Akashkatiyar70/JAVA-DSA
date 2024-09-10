public class addnum11{
    public static void main(String[] args){

        int x=10;
        int y=10;
     int res=addnumbers(x,y);
     System.out.println(res);


     //public method
     Siyaram o= new Siyaram();
     o.printHello();
    //  private method call
    // Modifiertest n=new Modifiertest();
    // n.printhello();

    }

    public  static int addnumbers (int a, int b)
    {
        int c= a+b;
        return c;
    }
}
// class Siyaram{
//     public void printSiyaram()
//     {
//         System.out.println("jai Siyaram");
//     }
// }