public class WrapperDemo1{
    public static void main(String []args){
    /*    int i=25;
        // Integer obj_i= Integer.valueOf(i);
        Integer obj_j=i;     // concept of autoboxing
        // System.out.println(obj_i);
        System.out.println(obj_j);
    */
    Integer obj_i=new Integer(27);  //[removal] Integer(int) in Integer has been deprecated and marked for removal

    // int i= obj_i.intValue();

    int j= obj_i;
    System.out.println(j);//i
    }
}