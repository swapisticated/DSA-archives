package arraysRecursion;

public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,41,5};
        System.out.println(sortedOrNot(arr,0));
    }

    public static boolean sortedOrNot(int[] arr, int index){

        if(index == arr.length - 1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedOrNot(arr,index+1);
    }
}

