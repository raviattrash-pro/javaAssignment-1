import java.util.Scanner;
class PerfectNum{
	public static void main(String args[]){
		PerfectNum obj = new PerfectNum();
		obj.perfect();
		obj.futureInvt();
		obj.revStr();
	}
	
	void futureInvt(){
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter Present value  : ");
		double presentValue = input.nextInt();
		System.out.println("Enter Interest rate  : ");
		double interest = input.nextInt();
		System.out.println("Enter time in years  : ");
		double time = input.nextInt();
		double f = presentValue*Math.pow((1+interest/100),time);
		System.out.println("Future investment value will be   : "+f);
	}
	
	void revStr(){
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter Present value  : ");
		
	}
	
	
	
	
	
	
	
	
	void perfect(){
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter any number to find whether it is perfect or not : ");
		int num = input.nextInt();
		int sum=0;
		
		for(int i=1;i<=(num/2);i++){
			if((num%i)==0){
				sum+=i;
			}
		}
		
		if(sum==num){
			System.out.println(num+" is a Perfect Number !!!!!  ");
		}
		else{
			System.out.println(num+" is Not a Perfect Number !!!!!  ");
		}
	}
}