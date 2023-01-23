import java.util.Scanner;
class Assignment3c{
	public static void main(String args[]){
		Assignment3c obj = new Assignment3c();
		obj.sumNegPosEven();
		obj.evenDays();
		obj.vowelConsonant();
	}
	
	void vowelConsonant(){
		Scanner input  = new Scanner(System.in);
		String check = input.next().toLowerCase();
		System.out.println("  check !!!!! "+check);
		if(Character.isAlphabetic(check.charAt(0))){
			switch(check.charAt(0)){
				case 'a':{
					System.out.println("  Vowel !!!!! ");
					break;
				}
				case 'e':{
					System.out.println("  Vowel !!!!! ");
					break;
				}
				case 'i':{
					System.out.println("  Vowel !!!!! ");
					break;
				}
				case 'o':{
					System.out.println("  Vowel !!!!! ");
					break;
				}
				case 'u':{
					System.out.println("  Vowel !!!!! ");
					break;
				}
			
				default:{
					System.out.println("  Consonent !!!!! ");
				}
			}
		}else{
			System.out.println(" Invalid Input!!!!" );
		}	
		
	}
	
	
	
	void evenDays(){
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the number of days in month");
		int day = input.nextInt();
		if(day>=28 &&day<=31){
			System.out.println("Ravi is allowed to go to out with his friend only on even days :  "+(day/2));
		}
		else{
			System.out.println(" Invalid Input!!!!" );
		}
	}
	
	
	
	
	
	
	void sumNegPosEven(){
		Scanner input  = new Scanner(System.in);
		int num,sumneg=0,sumPosEven=0,sumPosOdd=0;
		
		System.out.println("  Please Enter numbers and to exit please enter 0 !!!!!  ");

		do{
			num =input.nextInt();
			if(num<0){
				sumneg+=num;
			}
			else{
				if((num&1)==0){
					sumPosEven+=num;
				}
				else{
					sumPosOdd+=num;
				}
			}
			
		}while(num!=0);
		System.out.println("Sum of -ve number will be :  "+sumneg);
		System.out.println("Sum of +ve even number will be :  "+sumPosEven);
		System.out.println("Sum of +ve Odd number will be :  "+sumPosOdd);
	}
}