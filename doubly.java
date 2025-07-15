class Node{
    int data;
    Node prev, next;
    
    
    // constructor 
    
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    
}
public class doubly{
    
     Node head;
    
    // InsertAtBeginning
    
    public void InsertAtBeginning(int data){
         Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
         head = newNode;
    }
   
    
    
   // display Method 
   
   
  public void display(){
      Node temp = head;
      System.out.print("null<->");
      while(temp!=null){
          System.out.print(temp.data + " <->");
          temp = temp.next;
      }
      System.out.print("null");
  }

    public static void main(String[] args){
        
        doubly list = new doubly();
        list.InsertAtBeginning(40);
        list.InsertAtBeginning(50);
        list.InsertAtBeginning(60);
        list.InsertAtBeginning(70);
        
        list.display();   
    }
}