public class factorial{
    public static void  main (String [] args) {
        int a=5;
        int res=factorial(a);
        System.out.println(res);
    }
    public static int  factorial(int n){
        if(n==0 || n==1){
            return 1;} 
            else{
                int res = n*factorial(n-1);
                return res;
            }}
}