class LinkedList{
    private Node head;

    public void insert(Object object){
        Node node = new Node(object);
        node.next = null;  
        if(head==null){  
            head = node;    
        }
        else{  
            Node n = head; 
            while(n.next!=null){   
                n=n.next;   
            }   
            n.next=node;
        }
    }

    public void show(){
        if(head!=null){
            Node node = head;  
            while(node.next!=null){ 
                System.out.println(node.getData());   
                node=node.next;                     
            }
            System.out.println(node.getData());  
        }
        else{
            System.out.println("Empty LinkedList");
        }    
    }

    public void insertAtStart(Object object){
        Node node = new Node(object);

        node.next=head;  
        head=node;      
    }

    public void insertAt(int index,Object object){
        Node node = new Node(object);

        if(index==0){
            insertAtStart(object);
        }
        else{
            Node n = head;
           
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next = n.next; 

            n.next = node;        
        }
    }

    public void deleteAt(int index){
        if (head!=null){ 
            if(index==0){
                head=head.next;   
            }
            else{
                Node n=head;
                Node n1=null;
                for(int i=0;i<index-1;i++){
                    n=n.next;
                }
                n1 = n.next;  
                n.next = n1.next;  
                System.out.println(n1.getData()+" deleted");   

                n1=null;
            }
        }
        else{
            System.out.println("Empty LinkedList");
        }
    }

    public boolean isEmpty(){
        return (head==null);
    }
}