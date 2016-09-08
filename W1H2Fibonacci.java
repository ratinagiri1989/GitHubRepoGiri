package week1;

public class W1H2Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=1, n3, i, count=100;
				System.out.print(n1+" "+n2);
				{
				
				for ( i = 2; i < count; ++i) {
				n3=n1+n2;
				
				if (n3>=100) {break;
					
				}		
				n1=n2;
				n2=n3;
				System.out.print(" "+n3);
			}

	}

}}
