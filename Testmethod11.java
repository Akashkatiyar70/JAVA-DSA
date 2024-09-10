public  class Testmethod11{
    public static void main (String [] args){
//same method calling;
        Testmethod11 t=new Testmethod11();
        t.ram();
    
       // ram();//direct calling
        //new
        //create object
        Siyaram s= new Siyaram();
        s.printSiyaram();
    }
    public  void ram()//non static 
    {
        System.out.println("jai Shree Ram");
    }
}


//when we have method in different class or packege then w will call the method 
// by using object
class Siyaram{
    public void printSiyaram()
    {
        System.out.println("jai Siyaram");
    }
}