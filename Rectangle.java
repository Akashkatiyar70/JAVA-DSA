class Rectangle{
    int length;
    int width;
    public void set(int l, int w){
    length=l;
    width=w; 

}
public void print(){
    System.out.println("Length:"+length);
    System.out.println("width" + width);
}

public static void main(String [] args){
    Rectangle r=new Rectangle();
    r.set(10,20);
    //r.print();
    System.out.println(r);//by default call to String
    System.out.println(r.toString());//by default call to String
}}