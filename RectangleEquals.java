class RectangleEquals{
    int length;
    int width;
    RectangleEquals(int length,int width){
        this.length=length;
        this.width=width;
    }
    public String toString(){
        return "length"+length+"width"+width;
    }
    public static void main( String [] args){
        RectangleEquals r1=new RectangleEquals(10,20);
        RectangleEquals r2=new RectangleEquals(10,20);
        RectangleEquals r3=r1;
        if(r1==r3)
            System.out.println("Both are equal");
            else
            System.out.println("both are diffrent");
        
    }

}