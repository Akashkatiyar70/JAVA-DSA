public  class print123{
    public static void main(String [] args){
        print123(10);}
        public static void print123(int n){
            if(n==0) return;
            print123(n-1);
            System.out.println(n);
            // System.out.println("main hu recursion");
            // System.out.println(" Radhe Radhe..........");

        
    }
}