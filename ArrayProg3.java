public class ArrayProg3{
    public static void main ( String[] args){

        Scanner sc=newScanner(System.in);
        System.out.println("Enter the Length for array");

        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<arr.length;i++)
        {
            System.out.println("Enter data for index ="+i);
            int data = sc.nextInt();
            arr[i]=data;
        }
        System.out.println("enter the value to search in the array");
        int  item = sc.nextInt();
        boolean flag=false;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==item)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Yes item found in array");
        }
        else{
            System.out.println("item not found");
        
        }
    }
}