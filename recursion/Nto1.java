package recursion;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int n) {
    if(n==0){
        return;
    }
    fun(n-1);
        System.out.println(n);

    }
}
