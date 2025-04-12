package arraysRecursion;

public class rbsRecursion {
    public static void main(String[] args) {
    int[] arr= {1,4,6,2,7,3,8};
    int target = 3;
        System.out.println(rotatedBinarySearch(arr,target,0,arr.length-1));

    }
    static int rotatedBinarySearch(int[] arr, int target, int s, int e){

        if(s>e){
            return -1;
        }
        int mid =  s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s]<arr[mid]){
            if(target>arr[s]&&target<arr[mid]){
                return rotatedBinarySearch(arr, target,s,mid-1);
            }
            else{
                return rotatedBinarySearch(arr,target,mid+1,e);

            }
        }
        if (target>arr[s] && target < arr[mid]){
            return rotatedBinarySearch(arr,target,s,mid-1);
        }
        else {
            return rotatedBinarySearch(arr,target,mid+1,e);

        }
    }
}
