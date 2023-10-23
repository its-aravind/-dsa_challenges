package Pointers;
// O(logN) is the time complexity of this binary search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,56,67,89};
        int ans=search(arr,3);
        if(ans!=-1){
            System.out.println("target found at "+ans);
        }
        else{
            System.out.println("target not found");
        }
    }
    public static int search(int[] arr,int target){
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
