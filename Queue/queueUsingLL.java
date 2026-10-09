package Queue;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class queueUsingLL {
    Node start = null;
    Node end = null;
    int size = 0;

    void push(int x){
        Node temp = new Node(x);
        if( start == null){
            start = end = temp;
        }else{
            end.next = temp;
            end = temp;
        }
        size += 1;
    }

    void pop(){
        if( start == null){
            System.out.println("Queue is empty");
            return ;
        }
       Node  temp = start;
       start = start.next;
       if( start == null){
        end = null;
       }
        size -= 1;
    }
    
    int top(){
        if( start == null){
            System.out.println("Queueis empty");
            return -1;
        }
        return start.data;
    }

    int size(){
        return size;
    }

    public static void main(String[] args) {
    queueUsingLL q = new queueUsingLL();

    q.push(10);
    q.push(20);
    q.push(30);

    System.out.println("Front element: " + q.top());
    System.out.println("Size: " + q.size());

    q.pop();

    System.out.println("Front after pop: " + q.top());
    System.out.println("Size after pop: " + q.size());
}
}
