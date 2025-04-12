package misc;
import java.lang.*;

public class addWithoutCarry {

    public static int sum(int n, int m){

        int result = 0;
        int multiplier = 1;
        int bit_sum;
        while (n != 0 || m != 0) {

            bit_sum = (n % 10) + (m % 10);
            bit_sum %= 10;

            result = (bit_sum * multiplier) + result;

            n /= 10;
            m /= 10;

            multiplier *= 10;
        }
        return result;

    }
    public static void main(String args[])
    {
        int n = 8458;
        int m = 8732;
        System.out.println(sum(n, m));
    }

}
