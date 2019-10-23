import java.util.Scanner;
class Area{
	double length;
	double breadth;
	Area(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double returnArea(){
		double area=length*breadth;
		return area;
	}
}
class Area2{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter value of length :");
	double length=in.nextDouble();
	System.out.print("Enter value of breadth :");
	double breadth=in.nextDouble();	
	Area ar=new Area(length,breadth);
	System.out.println(ar.returnArea());
	}
}