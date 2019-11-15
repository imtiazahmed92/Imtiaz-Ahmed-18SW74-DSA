import java.util.*;

public class LinkedList{
    public static void main(String[]args)
    {
        Student s1 = new Student();    
        s1.setName("Imtiaz");
        s1.setAge(17);
        s1.setRollNo(74);

        Student s2 = new Student();
        s2.setName("Usama");
        s2.setAge(19);
        s2.setRollNo(52);

        Student s3 = new Student();
        s3.setName("Uzair");
        s3.setAge(18);
        s3.setRollNo(70);

        Student s4 = new Student();
        s4.setName("Waqar");
        s4.setAge(19);
        s4.setRollNo(82);
        

        LinkedList<Student> list1 = new LinkedList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

       
        System.out.println("********First Student********");
        list1.getFirst().showData();

       
        System.out.println("********Last Student********");
        list1.getLast().showData();

        System.out.println("********Student of Specified Index********");
        list1.get(2).showData();

        System.out.println("Index of spcified object: "+list1.indexOf(s3));

        Student s5 = new Student();
        s5.setName("Ahmed Ali");
        s5.setAge(14);
        s5.setRollNo(56);
        list1.addFirst(s5);

        list1.remove(0);

        LinkedList<Student> list = new LinkedList<>();
        list.addAll(list1);
        list1.clear();

        System.out.println("Size of List1: "+list1.size());
        System.out.println("Size of List2: "+list.size());

        list.pollLast().showData();

        System.out.println();

        ListIterator<Student> iter = list.listIterator();
        int i=0;
        while(iter.hasNext()){
            Student s = (Student)iter.next();
            System.out.println("********Student "+(++i)+"********");
            s.showData();
        }
    }
}