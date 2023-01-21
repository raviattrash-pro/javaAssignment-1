import java.util.Scanner;
class Assignment3{
	public static void main(String args[]){
		Assignment3 obj = new Assignment3();
		obj.area();
		obj.perimeter();
		obj.volSur();
	}
	
	
	void volSur(){
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the your choice from the following to find vol, CSA and TSA :  ");
		System.out.println(" 1.Cone 2.Prism 3. Cylinder 4.Sphere 5.Pyramid 6.cube");
	    int choice = input.nextInt();
		double vol;
		double tsa;
		double csa;
		switch(choice){
			case 1:{
				System.out.println("Enter radius  and height of cone  and slant hright:  ");
				double r = input.nextDouble();
				double h = input.nextDouble();
				double l = input.nextDouble();
				 vol = (3.14*r*r*h)/3;
				 csa = 3.14*r*l;
				 tsa = csa+(3.14*r*r);
				System.out.println("Volume of Cone will be :  "+vol);
				System.out.println("CSA of Cone will be :  "+csa);
				System.out.println("TSA of Cone will be :  "+tsa);
				break; 
			}
			case 2:{
				System.out.println("Enter the Base area and height and perimeter of  Prism : ");
				double b = input.nextDouble();
				double h = input.nextDouble();
				double p = input.nextDouble();
				vol = b*h;
				csa = 2*b*p*h;
				tsa = (p*h)+2*b;
				System.out.println("Volume of Prism will be :  "+vol);
				System.out.println("CSA of Prism will be :  "+csa);
				System.out.println("TSA of Prism will be :  "+tsa);
				break;
			}
			case 3:{
				System.out.println("Enter the radius  and height of cylinder : ");
				double r = input.nextDouble();
				double h = input.nextDouble();
				 vol = (3.14*r*r*h);
				 csa = 2*3.14*r*h;
				 tsa = csa+(2*3.14*r*r);
				System.out.println("Volume of cylinder will be :  "+vol);
				System.out.println("CSA of cylinder will be :  "+csa);
				System.out.println("TSA of cylinder will be :  "+tsa);
				break;
			}
			case 4:{
				System.out.println("Enter the radius  of Sphere : ");
				double r = input.nextDouble();
				 vol = (3.14*r*r*r*4)/3;
				 tsa = (4*3.14*r*r);
				System.out.println("Volume of Sphere will be :  "+vol);
				System.out.println("TSA of Sphere will be :  "+tsa);
				break;
			}
			case 5:{
				System.out.println("Enter the base length ,base width  and height of Pyramid : ");
				double l = input.nextDouble();
				double w = input.nextDouble();
				double h = input.nextDouble();
				 vol = (l*w*h)/3;
				System.out.println("Volume of Pyramid will be :  "+vol);
				break;
			}
			case 6:{
				System.out.println("Enter the base and height of the cube : ");
				double a = input.nextDouble();
				vol = a*a*a;
				tsa=6*a*a;
				csa=4*a*a;
				System.out.println("Volume of cube will be :  "+vol);
				System.out.println("CSA of cube will be :  "+csa);
				System.out.println("TSA of cube will be :  "+tsa);
				break;
			}
			default:System.out.println("Invalid input !!!!!!  ");
		}
	}
	
	
	
	
	
	
	
	void perimeter(){
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the your choice from the following to find perimeter :  ");
		System.out.println(" 1.circle 2. equilateral triangle 3. Parallelogram 4.Rectangle 5.Square  6. Rhombus  ");
	    int choice = input.nextInt();
		double peri=0;
		switch(choice){
			case 1:{
				System.out.println("Enter radius of circle :  ");
				double r = input.nextDouble();
				 peri = 3.14*r*2;
				System.out.println("perimeter of Circle will be :  "+peri);
				break; 
			}
			case 2:{
				System.out.println("Enter the side of  equilateral triangle : ");
				double a = input.nextDouble();
				peri =3*a;
				System.out.println("perimeter of equilateral triangle will be :  "+peri);
				break;
			}
			case 3:{
				System.out.println("Enter the side and base of the Parallelogram : ");
				double l = input.nextDouble();
				double b = input.nextDouble();
				peri = (b+l)*2;
				System.out.println("perimeter of Parallelogram will be :  "+peri);
				break;
			}
			case 4:{
				System.out.println("Enter the length and base of the Rectangle : ");
				double l = input.nextDouble();
				double b = input.nextDouble();
				peri = (b+l)*2;
				System.out.println("perimeter of Rectangle will be :  "+peri);
				break;
			}
			case 5:{
				System.out.println("Enter the length and base of the Square : ");
				double a = input.nextDouble();
				peri = 4*a;
				System.out.println("perimeter of Square will be :  "+peri);
				break;
			}
			case 6:{
				System.out.println("Enter the base and height of the Rhombus : ");
				double a = input.nextDouble();
				peri = 4*a;
				System.out.println("perimeter of Rhombus will be :  "+peri);
				break;
			}
			default:System.out.println("Invalid input !!!!!!  ");
		}
	}
	
	
	
	
	
	
	void area(){
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the your choice from the following to find area :  ");
		System.out.println(" 1.circle 2. triangle 3. Rectangle 4.Isoceles triangle 5.Parallelogram  6. Rhombus 7. equilateral triangle ");
	    int choice = input.nextInt();
		double area=0;
		switch(choice){
			case 1:{
				System.out.println("Enter radius of circle :  ");
				double r = input.nextDouble();
				 area = 3.14*r*r;
				System.out.println("Area of Circle will be :  "+area);
				break;
			}
			case 2:{
				System.out.println("Enter the base and height of the Triangle : ");
				double b = input.nextDouble();
				double h = input.nextDouble();
				area = 0.5*b*h;
				System.out.println("Area of Triangle will be :  "+area);
				break;
			}
			case 3:{
				System.out.println("Enter the length and base of the Rectangle : ");
				double l = input.nextDouble();
				double b = input.nextDouble();
				area = b*l;
				System.out.println("Area of Triangle will be :  "+area);
				break;
			}
			case 4:{
				System.out.println("Enter the length of similar side and base of the Isoceles triangle : ");
				double a = input.nextDouble();
				double b = input.nextDouble();
				area = (b/2)*(Math.sqrt((a*a)-((b*b)/4)));
				System.out.println("Area of Isoceles Triangle will be :  "+area);
				break;
			}
			case 5:{
				System.out.println("Enter the base and height of the Parallelogram : ");
				double b = input.nextDouble();
				double h = input.nextDouble();
				area = b*h;
				System.out.println("Area of Parallelogram will be :  "+area);
				break;
			}
			case 6:{
				System.out.println("Enter the base and height of the Rhombus : ");
				double d1 = input.nextDouble();
				double d2 = input.nextDouble();
				area = 0.5*d1*d2;
				System.out.println("Area of Rhombus will be :  "+area);
				break;
			}
			case 7:{
				System.out.println("Enter the side of  equilateral triangle : ");
				double a = input.nextDouble();
				area = (Math.sqrt(3)*a*a)/4;
				System.out.println("Area of Parallelogram will be :  "+area);
				break;
			}
			default:System.out.println("Invalid input !!!!!!  ");
		}
	}
	
	
}