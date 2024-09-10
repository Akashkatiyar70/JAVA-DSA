class newgfg{
    public static void main (String [] args){
     int countDigit(long n)
     {
        int count=0; 
        while(n!=0){
            n=n/10;
            ++count;
        }
            return count;
        

     }
        
    }
}