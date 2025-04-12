package hashing;
import java.util.*;


public class topK_Elements {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap <Integer,Integer> freqMap = new HashMap<>();
        List <Integer>[] freq = new List[nums.length+1];


        for(int i =0; i< freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }


        int[] res = new int[k];

        int index =0;

        for(int i = freq.length -1; i>0 && index <k; i--){

            for(int n : freq[i]){
                res[index++] = n;
                if( index == k){
                    return res;
                }
            }
        }
        return res;

    }
}
