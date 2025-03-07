package nqt;

import java.util.Scanner;

public class aliceAndFriends {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count =0;
        for(int j = 0; j<n; j++){
            if(arr[j] == arr[0]) count++;
        }


        System.out.println(n - count);
    }
}
