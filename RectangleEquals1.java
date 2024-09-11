class RectangleEquals1{
    int length;
    int width;
    RectangleEquals1(int length,int width){
        this.length=length;
        this.width=width;
    }
    public String toString(){  
        return "length"+length+"width"+width;
    }
    public boolean equals(Object obj){
        RectangleEquals1 r=(RectangleEquals1) obj;
        if((this.length==r.length)&&(this.width==r.width))
        return true;
        return false;

    }
    public static void main( String [] args){
        RectangleEquals1 r1=new RectangleEquals1(10,20);
        RectangleEquals1 r2=new RectangleEquals1(10,20);

        if(r1.equals(r2))      
            System.out.println("Both are equal");
            else
            System.out.println("both are diffrent");

        
    }

}