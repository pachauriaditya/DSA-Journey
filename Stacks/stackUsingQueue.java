package Stacks;
import java.util.*;
public class stackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x){
        int s = q.size();
        q.add(x);
        for( int i = 0 ; i< s ;i++){
            q.add(q.remove());
        }
    }

    void pop(){
        if( q.isEmpty()){
            System.out.println("Stack is empty");
            return ;
        }
        q.remove();
    }

    int top(){
        if( q.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return  q.peek();
    }

    int size(){
        return  q.size();
    }
     
     public static void main(String[] args) {
        stackUsingQueue st = new stackUsingQueue();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        System.out.println(st.size());
    }
}
