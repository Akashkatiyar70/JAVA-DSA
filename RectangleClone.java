class RectangleClone implements Cloneable{
    int length;
    int width;
    public RectangleClone(int length,int width){
        this.length=length;
        this .width=width;
    }
    public String toString(){
        return "length:"+length+"width:"+width;
    }
    public static void main (String [] args){
        RectangleClone r1= new RectangleClone(10,20);
        
        try{
        RectangleClone r2=(RectangleClone) r1.clone();
        System.out.println(r1  );
        System.out.println(r2  );
        r2.length=35;
        System.out.println("after Modifying R2- length");
        System.out.println(r1  );
        System.out.println(r2  );
        }
        catch(CloneNotSupportedException ce){
            System.out.println(ce);
        }
    }
}