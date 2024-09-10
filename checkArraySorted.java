public class checkArraySorted{
    public static void main (String [] args){
        int arr[]={1,2,3,4,3};
        System.out.println(checkArray(arr,0));
    }
    public static boolean checkArray(int arr [], int i){
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return checkArray(arr,i+1);
        
    }
}