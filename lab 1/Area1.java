import java.util.Scanner;
class Area{

	double length;
	double breadth;
	
	public void setDimentions(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea(){
	double ar=length*breadth;
	return ar;
	}
}
class Area1{
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.print("Enter value of length: ");
		double length=in.nextDouble();
		System.out.print("Enter value of breadth :");
		double breadth=in.nextDouble();
		Area area=new Area();
		area.setDimentions(length,breadth);
		System.out.println(area.getArea());
		}
}