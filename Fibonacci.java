//big integer is a tool that helps java run an infinit number of whole numbers to save space 
import java.math.BigInteger;
//starting point
public class Fibonacci {
    public static void main(String[] args) {
//initialising variable
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First 100 Fibonacci numbers:");

        for (int i = 1; i <= 100; i++) {
            System.out.println(first);

            BigInteger next = first.add(second);
            first = second;
            second = next;
        }
    }
}
