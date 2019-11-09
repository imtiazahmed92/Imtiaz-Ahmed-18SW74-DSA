class Task4
{
	 public static float apply(float[] a) 
	 {
	    float aver=0.0f;
	    for(int i=0;i<a.length;i++)
	    {
	        aver=aver+a[i];
	    }
	    System.out.println(aver);
    	return (aver/a.length);
	 }

	 public static void main(String args[])
	 {
	    float[] l={1.1f,2.2f,3.3f,4.7f,7.9f};     
	    System.out.println("Print the Average: "+apply(l)); 
	 }
}