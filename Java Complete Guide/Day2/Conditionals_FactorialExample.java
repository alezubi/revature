package Day2;

import java.math.BigInteger;

public class Conditionals_FactorialExample {
    public static void main(String[] args) {
        int num = 4;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
