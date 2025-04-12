package recursion;

public class palindrome {
    static int pal(int n){
        int letters = (int)Math.log10(n)+1;
        return helper(n,letters);
    }

    private static int helper(int n, int letters) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,letters-1) + helper(n/10,letters-1);
    }
    static boolean palindromeNUmber(int n){

        return n== pal(n);
    }

    public static void main(String[] args) {
        System.out.println(palindromeNUmber(12321));
    }
}
