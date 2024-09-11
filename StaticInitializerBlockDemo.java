public class StaticInitializerBlockDemo{
    private int i=0;
    private static int j=2;
    public static void main(String[] args){
        System.out.println("main started");
        StaticInitializerBlockDemo obj1= new StaticInitializerBlockDemo();
        System.out.println("main End");
    }
    {
        i++;
        System.out.println("Initializer- Block-1:"+j);
    }
    {
        i++;
        System.out.println("Initializer- Block-2:"+i);
    }
    public StaticInitializerBlockDemo(){
        i++;
        System.out.println("Inside Constructor");
    }
    static{
        j++;  //non-static variable i cannot be referenced from a static context
        System.out.println("static Initializer Block-1:"+j);
    }
    static{
        System.out.println("static Initializer Block-2:");

    }
}