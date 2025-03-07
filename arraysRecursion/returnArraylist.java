package arraysRecursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class returnArraylist {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,6};
        System.out.println(arlist(arr,0,5, new ArrayList<>()));
        System.out.println(arrayListWithoutParameter(arr,0,5));
    }
    static ArrayList<Integer> arlist(int[] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return arlist(arr,index+1,target,list);
    }
    static ArrayList<Integer> arrayListWithoutParameter(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow= arrayListWithoutParameter(arr,index+1,target);
        list.addAll(ansFromBelow);
        return  list;
    }
}
