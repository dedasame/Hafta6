import java.time.LocalDateTime;

public class RecursionFunctions {
	
	static int n1=0,n2=1, n3=0;
	
	//degismeyenler
	enum Level{
		LOW,MEDIUM,HIGH
	}
	
	static void fib(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.printf(" "+n3);
		    fib(count-1);    
		}	
	}
	
	public static void main(String[] args) {
		int count = 10;
		
		LocalDateTime time = LocalDateTime.now();
		//yapilan islemleri tutma
		
		System.out.printf(n1+" "+n2);
		fib(count-2);
		System.out.println("");
		System.out.println(time);
		
		Level seviye = Level.MEDIUM;
		seviye = Level.LOW;
		System.out.println(seviye);
		
		
		
	}
}
