package week1;

public class W1H1PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("The prime numbers are:");	
		
		for (int i = 30; i < 45; i++) {
			
			boolean IsPrime = true;
			
			for (int j = 2; j < i; j++) {
				
				if (i%j==0) {
					IsPrime = false;
					break;
									} 
				
							}
			if(IsPrime){
				System.out.println(i);
				
			}
		}
}
}