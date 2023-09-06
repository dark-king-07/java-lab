package varun;
public class MinMax
{  
    class Node
    {  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) 
        {  
            this.data = data;  
        }  
    }  
  
    Node head, tail = null;  
  
    public void addNode(int data) 
    {  
        Node newNode = new Node(data);  
        if(head == null) 
        {      
            head = tail = newNode;   
            head.previous = null;  
            tail.next = null;  
        }  
        else 
        {  
            tail.next = newNode;       
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
   
    public int minimumNode()
    {  
        
        Node current = head;  
        int min;       
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else 
        {        
            min = head.data;  
            while(current != null) 
            {  
                 if(min > current.data)  
                    min = current.data;  
                current = current.next;  
            }  
        }  
        return min;  
    }  
  
    
    public int maximumNode() 
    {      
        Node current = head;  
        int max;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else 
        {      
            max = head.data;    
            while(current != null) 
            {  
                if(current.data > max)  
                    max = current.data;  
                current = current.next;  
            }  
        }  
        return max;  
    }  
  
    public static void main(String[] args) 
    {  
  
        MinMax m = new MinMax();  
        m.addNode(5);  
        m.addNode(-7);  
        m.addNode(9);  
        m.addNode(100);  
        m.addNode(2);  
        System.out.println("Minimum value node in the list: "+ m.minimumNode());  
        System.out.println("Maximum value node in the list: "+ m.maximumNode());  
    }  
}  