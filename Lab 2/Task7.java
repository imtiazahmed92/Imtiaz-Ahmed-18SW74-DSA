import java.util.*;
class Task7{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[]a=new int[50];
		int[]b=new int[50];
		int size=8,i,j,count=0;
		System.out.println("enter Array");
		for (i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		for (i=0;i<size;i++) {
			for (j=0;j<count;j++) {
				if(a[i]==b[j])
					break;
			}
			if (j==count) {
				b[count]=a[i];
				count++;
			}
		}
		System.out.println("removed dupliacated element");
		for (int k=0;k<count;k++) {
			System.out.println(b[k]);
		}
		System.out.println("index  "+count);
	}
}