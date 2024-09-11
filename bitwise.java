class bitwise
{
    public static void main(String [] args)
    {
        int a=2;
        int b=a<<(2+a)>>1;
        System.out.println(b);

        int p=6;
        int c=p<<8-p<<2;
        System.out.println(c);
    }
}