class Rectangle1{
    int length;
    int width;
    public void set(int l, int w){
    length=l;
    width=w; 

}
// public void print(){
//     System.out.println("Length:"+length);
//     System.out.println("width" + width);
// }
public  String toString(){
    String msg;
    msg="length:"+length+"width:"+width;
    return msg;
}
public static void main(String [] args){
    Rectangle1 r=new Rectangle1();
    r.set(10,20);

    System.out.println(r);
    System.out.println(r);
    // System.out.println(r.toString());

    // length:10width:20//this value call
    // length:10width:20
}}