package assignment1;


public class Fibonacci {
	 
	public static void Fibo(){ // used static to avoid object creation while calling this method
		int num1 = 1;
		int num2 = 2;
		int num3;
		
		System.out.println("the fibonacci series is:");
		System.out.print(num1 +","+num2+",");
		for(int i=0;i<=15;i++) // iterate till i value reaches it limit
		{
			num3= num1 + num2;
			System.out.print(num3+",");
			num1 = num2;
			num2=num3;
			
	        
			
		}
			
	}
	
	public static void main(String[] args) { // used static during method creation
		Fibo();                             // no need of method creation
		
	}
	

}
