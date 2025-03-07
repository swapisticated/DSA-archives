package recursion;

public class sumOfDigits {
    public static void main(String[] args) {
    int ans = sumDigits(1234);
        System.out.println(ans);
    }

    private static int sumDigits(int n) {
        if(n==0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }
}
