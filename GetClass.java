class GetClass{
    public static void  main( String[] args) {
        GetClass obj=new GetClass();
        String className= obj.getClass().getSuperclass().getName();
        System.out.println(className);
        System.out.println(className.getClass().getName());


        
    }
}