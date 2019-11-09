import java.util.Random;

class Task1
{
	 public static void main(String args[])
	 {

	     Random r=new Random(); 
	     int[] arr=new int[100]; 
	     for(int i=0;i<arr.length;i++)
	     {
	        arr[i]=r.nextInt();   
            System.out.println(arr[i]);   
	     }
	 }
}