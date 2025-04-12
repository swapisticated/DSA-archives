package arraysRecursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int[] arr1 = {1,2,34,3,3,4};
        System.out.println(findIndex(arr,0,3));
        System.out.println(find(arr,0,3));
        System.out.println(findIndexrev(arr,arr.length-1,3));
        findAllIndex(arr1,0,3);
        System.out.println(list);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int index, int target){

        if(index == arr.length){
            return;
        }
        if( arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr,index+1,target);
    }
    public static int findIndex(int[] arr, int index, int target){

        if(index == arr.length){
            return -1;
        }
        if( arr[index] == target) {
            return index;
        }
       return findIndex(arr,index+1,target);
    }
    public static boolean find(int[] arr, int index, int target){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || find(arr,index+1,target);
    }
    public static int findIndexrev(int[] arr, int index, int target){

        if(arr[index] == -1){
            return -1;
        }
        if( arr[index] == target) {
            return index;
        }
        return findIndexrev(arr,index-1,target);
    }
}
