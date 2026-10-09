package Stacks;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class stackUsingLL {
    Node top = null;
    int size = 0;

    void push(int x){
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size += 1;
    }

    int top(){
        return top.data;
    }

   void pop() {
    if (top == null) {
        System.out.println("Stack is empty");
        return;
    }

    top = top.next;
    size -= 1;
    }

    int sizee(){
        return size;
    }


    public static void main(String[] args) {
         stackUsingLL st = new stackUsingLL();
         st.push(10);
         st.push(20);
         st.push(30);
          System.out.println("Top element: " + st.top());
          System.out.println("Size: " + st.sizee());
          st.pop();
          System.out.println("Top element after pop: " + st.top());
          System.out.println("Size after pop: " + st.sizee());
    }
}
