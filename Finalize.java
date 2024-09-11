class Finalize{
    protected void finalize(){
        System.out.println("Finalize Method is called");
    }
    public Finalize(){
        System.out.println("Finalized Method is Created");
    }
    public static void main (String [] args){
        Finalize obj= new Finalize();
        obj=null;
        System.gc();
        System.out.println("Main Exit");
    } 
}