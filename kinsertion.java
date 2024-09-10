public class kinsertion{
    public static void main(String[] args){
        int arr [] ={-12,-11,-3,5,6,15,16,18,19};
        int k=19;
        int insertion2= findinsertion2(arr[] , k);
        System.out.println(insertion2);
    }
    public static int findinsertion(int arr[] ,int k){
        if(arr[arr.length-1]<k) return arr.length;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==k) return i;
            else if (arr [i]>k) return i;
        }
        return -1;
    }
    public static void findinsertion2(int arr [], int k){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==k)
            {
                return mid;
            }

                else if (arr[mid]<k)
                {

                low=mid+1;
            }
            else{
                high=mid-1;
            }

            }
            return low;
        }
    
    
    }
