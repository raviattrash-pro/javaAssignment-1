import java.util.*;
class CheckLeap{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		CheckLeap obj = new CheckLeap();
		obj.checkyear(year);
		System.out.println("Enter the 2 numbers ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		obj.sum(num1,num2);
		System.out.println("Enter the number to find table");
		int numtable = input.nextInt();
		obj.table(numtable);
		int mysum=0;
		obj.lcmhcf(num1,num2);
		int  n1;
		boolean check;
		do{
			n1 = input.nextInt();
			 mysum += n1;
			  check = input.hasNextInt();   // If you use the Scanner.hasNextInt() (Java Platform SE 7 )[^] method, you will get feedback as to whether there is an integer or something else in the input buffer.
		}while(check);
		System.out.println("My sum === "+mysum);
	}
	void checkyear(int year){
		//checking year 
		if(year %400==0 || year%100!=0 && year%4==0){
			System.out.println("Leap year ");
		}
		else{
			System.out.println("Not Leap Year ");
		}
	}
	
	void sum(int n1,int n2){
		System.out.println("Sum ==  "+(n1+n2));
	}
	
	void table(int n1){
		for(int i=1;i<11;i++){
			System.out.println(n1+" * "+i+"  =  "+" "+(n1*i));
		}
	}
	void lcmhcf(int n1,int n2){
		int product = n1*n2;
		int h = hcf(n1,n2);
		int l = product/h;
		
		System.out.println("  HCM :  "+h);
		System.out.println("  LCM :  "+l);
		
		
	}
	static int hcf(int a,int b){
		if(b==0){
			return a;
		}
		return hcf(b,a%b);
	}
}