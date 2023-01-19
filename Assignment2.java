import java.util.Scanner;
class Assignment2{
	public static void main(String args[]){
		Assignment2 obj = new Assignment2();
		String name = obj.hello();
		obj.oddeven(name);
		obj.interest(name);
		obj.operatorLarger();
		obj.inrToUsd();
		obj.fibo();
		boolean check = obj.palindrome();
		obj.palcheck(check);
		obj.Arm();
		
	}
	
	void Arm(){
			Scanner input = new Scanner(System.in);
			System.out.println(" Hey Please Enter any number ");
			int num = input.nextInt();
			int temp = num;
			int r=0,s=0;
			while(num>0){
				r= num%10;
				s=s+(r*r*r);
				num = num/10;
			}
			if(s==temp){
				System.out.println("Armstrong Number  !!!!");
			}
			else{
				System.out.println(" Not Armstrong Number  !!!!");
			}
		}
	
	boolean palindrome(){
			Scanner input = new Scanner(System.in);
			System.out.println(" Hey Please Enter any string   ");
			String str = input.next();
			int l=0,r=str.length()-1;
			while(l<r){
				if(str.charAt(l)!=str.charAt(r)){
					return false;
				}
				l+=1;
				r-=1;
			}
			return true;
		}
		
		
		void palcheck(boolean check){
			if(check){
				System.out.println("Palindrome String !!!!");
			}
			else{
				System.out.println("Not a Palindrome String !!!!");
			}
		}
	
		void fibo(){
			Scanner input = new Scanner(System.in);
			System.out.println(" Hey Please Enter any number ");
			int num = input.nextInt();
			int a=0,b=1;
			int c;
			System.out.println(" fibonacci Series will be :   ");
			System.out.println(a);
			System.out.println(b);
			for(int i=2;i<num;i++){
				c=a+b;
				a=b;
				b=c;
				System.out.println(b);
			}

		}
	
		
		void inrToUsd(){
			Scanner input = new Scanner(System.in);
			System.out.println(" Hey Please Enter Amount in INR ₹   !!!!!  ");
			double inr = input.nextDouble();
			System.out.println(inr+" ₹  ===== "+(inr*0.01224458333)+" $ ");
		}
	
	
	void operatorLarger(){
		Scanner input = new Scanner(System.in);
		System.out.println(" Hey Please Enter your 1st number  !!!!!  ");
		double num1 = input.nextDouble();
		System.out.println(" Hey Please Enter your 2st number  !!!!!  ");
		double num2 = input.nextDouble();
		System.out.println(" Hey Please Enter your operator (+,-,*,/)   !!!!!  ");
		String op = input.next();
		switch(op.charAt(0)){
			case '+' :{
			System.out.println(" Addition of "+num1+" And "+num2+" Will be : "+(num1+num2));
			break;
			}
			case '-' :{
			System.out.println(" Substraction of "+num1+" And "+num2+" Will be : "+(num1-num2));
			break;
			}
			case '/' :{
			System.out.println(" Division of "+num1+" And "+num2+" Will be : "+(num1/num2));
			break;
			}
			case '*' :{
			System.out.println(" Multiplication of "+num1+" And "+num2+" Will be : "+(num1*num2));
			break;
			}
			default :{
				System.out.println("Invalid operation!!!! ");
			}	
		}
		
		if(num1-num2>0){
			System.out.println(num1+" Greater than "+num2);
		}
		else{
			System.out.println(num2+" Greater than "+num1);
		}

	}
	
	String hello(){
		Scanner input = new Scanner(System.in);
		System.out.println(" Hey Please Enter your Name !!!!!  ");
		String name = input.next();
		return name;
	}
	
	void interest(String name){
		Scanner input = new Scanner(System.in);
		System.out.println("Hey "+name.toUpperCase()+ "  Please Enter the Principal amount !!!!!  ");
		int p =input.nextInt();
		System.out.println("Hey "+name.toUpperCase()+ "  Please Enter the rate of interest in % !!!!!  ");
		int r =input.nextInt();
		System.out.println("Hey "+name.toUpperCase()+ "  Please Enter the time in year !!!!!  ");
		int t =input.nextInt();
		int si =(p*r*t)/100;
		System.out.println("Hey "+name.toUpperCase()+"Simple Interest will be  "+si);
	}
	
	void oddeven(String name ){
		Scanner input = new Scanner(System.in);
		System.out.println("Hey "+name.toUpperCase()+ "  Please Enter the Numner !!!!!  ");
		int num = input.nextInt();
		if((num&1)==0){
			System.out.println(num+" is Even Number ");
		}
		else{
			System.out.println(num+" is Odd Number ");
		}
	}
}