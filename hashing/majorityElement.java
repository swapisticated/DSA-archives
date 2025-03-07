package hashing;

import java.util.*;

public class majorityElement {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(element(arr));
    }

    public static int element(int[] nums) {


        Map <Integer, Integer> map = new HashMap<>();
//        int threshold = nums.length/2;
//        int count = 0;
//        for(int num : nums){
//            map.put(num, map.getOrDefault(num, 0) +1);
//
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > threshold) {
//                return entry.getKey(); // Found the majority element
//            }
//        }


        int result = 0, maxCount =0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
            if(map.get(num) > maxCount){
                result = num;
                maxCount = map.get(num);
            }
        }
        return result;
    }
}
