class Employee
{
	public int sal;
	public int hr;
	public void getInfo(int salary,int hours){
    
	sal=salary;		
    hr=hours;
     
    System.out.println("Salary of an Employee:"+salary);
    System.out.println("Working Hours :"+hours);
	}
	
	 public void  addSal()
	
	{
   
	if(sal>500)
	{
	sal=sal+10;
	}
	}
	public void addWork(){
	if(hr>5)
	{
	sal=sal+5;
	   }  
	   System.out.println("Salary depending on hours:"+sal); 
	}
	public static void main(String args[])
	{
	Employee e= new Employee();
	System.out.println("Employee Details:");
	e.getInfo(1000,9);
	e.addSal();
	e.addWork();
	
	

	}
}