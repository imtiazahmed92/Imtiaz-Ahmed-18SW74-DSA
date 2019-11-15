import java.util.Arrays;
public class BinarySearch{
    public static int charSearch(char []a,char key){
        int p=0;  
        int q=a.length-1; 
        int i=-1;  
        while(p<=q){
            i=(p+q)/2;    
            if(a[i]==key){   
                return i;   
            }
            if(a[i]<key){   
                p=i+1;   
            }
            else{
                q=i-1;   
            }
        }
        return -i;   
    }

    public static int stringSearch(String []a,String key){
        int p=0;           
        int q=a.length-1;  
        int i=-1;   

        int res;   

        while(p<=q){
            i=(p+q)/2;    
            res= key.compareTo(a[i]);   
            if(res==0){                 
                return i;            
            }
            if(res>0){    
                p=i+1;      
            }
            else{
                q=i-1;    
            }
        }
        return -i;   
    }

    public static void main(String[]args)
    {
        String []arr={"Imtiaz","Ahmed","Muneer","Usama","Waqar","Uzair"};   
        char []c = {'a','u','i','e','o'};          
        String key1="Muneer";   
        char key2='o';         
        Arrays.sort(arr);  
        Arrays.sort(c);    
       
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }

        for(int i=0;i<c.length;i++){
            System.out.println("arr["+i+"]= "+c[i]);
        }

        int index1=stringSearch(arr, key1);
        int index2=charSearch(c, key2);

        if(index1>0){
            System.out.println("String Found, index is "+index1);  
        }
        else{
            System.out.println("String not found");         
        }

        if(index2>0){
            System.out.println("Character Found, index is "+index2);    
        }
        else{
            System.out.println("Character not found");
        }
    }
} 