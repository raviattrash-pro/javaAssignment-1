import java.util.Scanner;
class Assignment3b{
	public static void main(String args[]){
		Assignment3b obj = new Assignment3b();
		obj.prodAndSumOfDigit();	
		obj.sumAndLarge();
	}
	
	
	void sumAndLarge(){
		Scanner input  = new Scanner(System.in);
		int  n1,mysum=0;
		int max=Integer.MIN_VALUE;
		do{
			n1 = input.nextInt();
			 mysum += n1;
			 if(n1>max){
				 max=n1;
			 }
		}while(n1!=0); //exit 
		System.out.println(" sumof inputs  === "+mysum);
		System.out.println(" maximum of inputs  === "+max);	
	}
	
	
	
	
	
	
	
	void prodAndSumOfDigit(){
		Scanner input  = new Scanner(System.in);
		System.out.println("  Enter any number  !!!!!  ");
		int num = input.nextInt();
		
		//product and sum  of digit
		int prod=1,r=0,sum=0;
		int temp1 = num;
		while(temp1>0){
				r= temp1%10;
				prod=prod*(r);
				sum=sum+(r);
				temp1 = temp1/10;
		}
		
		System.out.println("Substract the Product and sum of Digit of an Interger with the given number  "+num+"   :  "+(prod-sum));
		
		
		//factorial
		long temp3=num,fact=1;
		while(temp3>0){
			fact*=temp3;
			temp3--;
		}		
		System.out.println("factorial of ( upto 20 fine)"+num+" will be  :  "+fact);
	}
	
}