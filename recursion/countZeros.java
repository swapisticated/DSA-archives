package recursion;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(10000 ));
    }

    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }
//        return helper(n-1,count+1);
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
