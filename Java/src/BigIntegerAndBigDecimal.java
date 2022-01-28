import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerAndBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double a = 0.03;
//		double b = 0.04;
//		
//		double c = b - a;
		
		//new - to allocate dynamic/runtime memory 
		
//		BigDecimal a = new BigDecimal("0.03");
//		BigDecimal b = new BigDecimal("0.04");
//		
//		BigDecimal c = b.subtract(a); // b - a;
		
		BigInteger a = new BigInteger("723489584896");
		BigInteger b = new BigInteger("814602419699");
		
		BigInteger c = a.add(b); 
		
		System.out.println(c);

	}

}
