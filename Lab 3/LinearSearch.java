public class LinearSearch{
    public static <T> int linearSearch(T []a,T key){
        int i;  
        for(i=0;i<a.length;i++){
            if(a[i]==key){
                return i;           
            }
        }
        return -i; 
    }
    public static void main(String[]args){
        String []arr={"Imtiaz","Ahmed Ali","Muneer","Usama","Waqar","Uzair"}; 
        Character []c = {'a','e','i','o','u'};   
        String key1="Muneer";  
        char key2='i';         

        int index1=linearSearch(arr, key1);  
        int index2=linearSearch(c, key2);    

        if(index1>=0){
            System.out.println("String found in String Array, index is "+index1);  
        }
        else{
            System.out.println("String not found");
        }

        if(index2>=0){
            System.out.println("Character found in Character Array, index is "+index2); 
        }
        else{
            System.out.println("Character not found");
        }

    } 
}