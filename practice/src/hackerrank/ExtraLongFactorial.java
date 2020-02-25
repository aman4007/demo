package hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorial {
	
	static void extraLongFactorials(int n) {
		BigInteger f=BigInteger.ONE;
		
		for(int i=1;i<=n;i++) {
			BigInteger bigInteger = BigInteger.valueOf(i);
			f=f.multiply(bigInteger);
		}
			
		System.out.println(f);
		


    }
	static BigInteger factorial(BigInteger n) {
		if(n==BigInteger.ONE)
			return BigInteger.ONE;
		else
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		// BigInteger bigInteger = BigInteger.valueOf(n);
		extraLongFactorials(25);
		//extraLongFactorials(5);
		//factorial(bigInteger);

	}

}
