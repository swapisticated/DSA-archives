package hashing;

import java.util.*;

class hashsets1 {
    public static int findMaxStones(int M, int N, int[] commonStones) {
        // Create list of available weights
        List<Integer> availableWeights = new ArrayList<>();
        Set<Integer> commonSet = new HashSet<>();

        // Convert common stones to set
        for (int stone : commonStones) {
            commonSet.add(stone);
        }

        // Get available weights (not common with Earth)
        for (int i = 1; i <= M; i++) {
            if (!commonSet.contains(i)) {
                availableWeights.add(i);
            }
        }

        // Sort available weights
//        Collections.sort(availableWeights);

        int stonesCount = 0;
        int weightSum = 0;

        // Take stones while we can fit them in the bag
        for (int weight : availableWeights) {
            if (weightSum + weight <= M) {
                weightSum += weight;
                stonesCount++;
            } else {
                break;
            }
        }

        return stonesCount;
    }

    public static void main(String[] args) {
        // Test Case 1: M=10, N=3, commonStones=[1,3,5]
        System.out.println("Test Case 1: " +
                findMaxStones(10, 3, new int[]{1, 3, 5}));  // Should output 2

        // Test Case 2: M=14, N=4, commonStones=[4,6,8,9]
        System.out.println("Test Case 2: " +
                findMaxStones(14, 4, new int[]{4, 6, 8, 9}));  // Should output 4

        // Test Case 3: M=5, N=2, commonStones=[1,2]
        System.out.println("Test Case 3: " +
                findMaxStones(5, 2, new int[]{1, 2}));  // Should output 1

        // Test Case 4: M=3, N=3, commonStones=[1,2,3]
        System.out.println("Test Case 4: " +
                findMaxStones(3, 3, new int[]{1, 2, 3}));  // Should output 0
    }
}