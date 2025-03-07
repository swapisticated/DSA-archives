package nqt;

import java.util.Arrays;

public class goldCoins {

    public static void main(String[] args) {
        int N = 10, K = 15;
        int[] coins = {5,3, 7, 14, 18, 1, 18, 4, 8, 3, };


        System.out.println(Arrays.toString(maxSubarrayLength(N, K, coins)));
    }

    private static int[] maxSubarrayLength(int n, int k, int[] coins) {

//        int maxLength = 0;
        int start =0;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += coins[end];

            // Shrink the window if sum becomes >= K
//            while (currentSum >= k && start <= end) {
//                currentSum -= coins[start];
//                start++; // Move the start pointer forward


            while( currentSum > k && start <= end){
                currentSum -= coins[start];
                start ++;
            }

            if( currentSum == k){
                return new int[]{start + 1, end+1};
            }



            // Update max length of valid subarray
//            maxLength = Math.max(maxLength, end - start + 1);
        }

        return new int[0];
    }

//    private static int maxSubarrayLength(int n, int k, int[] prices) {
//
//        int max = 0;
//        for(int i = 0 ; i< n; i++){
//            int current = 0;
//
//            for(int j = i; j<n;j++){
//
//                current += prices[j];
//
//                if(current < k ){
//                    max = Math.max( max,j-i+1);
//                }else {
//                    break;
//                }
//            }
//        }
//
//        return max;
//    }
}
