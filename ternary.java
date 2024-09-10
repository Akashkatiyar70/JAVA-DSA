class ternary{
    public static void main(String[] args){
        int a=10,b=5;
        String s=(a<b)?"hello":"Ji";
        System.out.println(s);

        System.out.println("........................");
        int a1=6;
        String s1=(a1%2==0)?"even":"odd";
        System.out.println(s1);

        System.out.println("........................");   
        int x=7,b1=3,c=5;
        int res=a<b1?a>c?a:b1:c;
        System.out.println(res);

        int k=7,l=88,m=34;
        int res1=k>l?k>1?k:m:l;
        System.out.println(res1);

    }
} 