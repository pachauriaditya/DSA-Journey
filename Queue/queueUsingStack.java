package Queue;
import java.util.*;

public class queueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int x){
       s1.push(x);
    }

    void pop(){
        if( s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if( s2.isEmpty()){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }

    int top(){
        if( s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if( s2.isEmpty()){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    int size(){
        return s1.size() + s2.size();
    }

    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front: " + q.top());
        q.pop();
        System.out.println("Front after pop: " + q.top());
        System.out.println("Size: " + q.size());
    }
}
