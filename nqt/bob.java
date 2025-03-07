package nqt;
//
//Question 2
//
//Bob is going to bet today on horse riding. There are N horses listed in a sequence of 1 to N.
//
//The probability of winning each horse is different so the prices for making a bet on the horses are not the same. There is no limit on the number of horses on which he can bet, but he thinks that if he bets on a continuous sequence of horses then he has a better chance to win. Bob will get K units of money if any horse on which he bets will win. But as the award is only K units so he wants to put money less than K. Bob wants to bet on as many horses as he can. As you are his best friend, he reached out to you for help, can you please find the length of the maximum continuous sequence of horses on which Bob can make a bet, and remember he will invest money less than K units. If there is more than one possible combination, Bob will bet randomly on any one of them.
//
//Given the number of horses(N), reward money(K), and price of betting on N horses in order.
//
//        Hint: For each starting index of a horse, its end index in sequences will be equal to or greater than the end index of the previous starting index.
//
//Example 1:
//
//Input:
//        90 100 -> N = 10, K=100
//        30 40 50 20 20 10 90 10 10 10 -> Price to make bet on each horse in order
//Output:
//        3
//Explanation:
//There are 10 horses, and the reward money is 100. So, Bob will put money in less than 100. There are two possible o sequences of length three whose total money for betting is less than 100, i.e. [50 20 20] (sum is 90) and [10 10 10] (sum is 30). Bob will choose randomly one sequence from these two. As none of the other sequences with a length greater than 3 will have a price less than 100 so the answer will be 3.
//
//Example 2:
//
//Input:
//        10 100 -> N = 10, K=100
//        10 90 80 20 90 60 40 60 70 75 -> Price to make bet on each horse in order
//
//Output:
//        1
//
//Explanation:
//There are no two consecutive horses for which the sum of price is less than 100. So, Bob will choose randomly any one horse. And the max length of the sequence will be 1.
//
//Constraints:
//
//        2<=N<=105
//        1<= K<=109
//        1<=A1, A3… AN<=109
//
//The Input format for testing:
//
//The candidate has to write the code to accept 2 inputs.
//
//First Input: It will contain two integers N (number of horses) and K (reward money)
//Second Input: It will contain N integers, each separated


public class bob {

    public static void main(String[] args) {
        int N = 10, K = 100;
        int[] prices = {30, 40, 50, 20, 20, 10, 90, 10, 10, 10 };

        System.out.println(maxSubarrayLength(N, K, prices)); 
    }

    private static int maxSubarrayLength(int n, int k, int[] prices) {

        int maxLength = 0;
        int start =0;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += prices[end];

            // Shrink the window if sum becomes >= K
            while (currentSum >= k && start <= end) {
                currentSum -= prices[start];
                start++; // Move the start pointer forward
            }

            // Update max length of valid subarray
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
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
