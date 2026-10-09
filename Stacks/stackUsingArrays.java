package Stacks;

public class stackUsingArrays {
 int [] st = new int[10];
 int top = -1;  

 void push(int x){
    if( top >= 10){
        System.out.println("Stack Overflow");
        return ;
    }
    top = top +1;
    st[top] = x;
 }

 int top(){
    if( top == -1){
        System.out.println("empty stack");
        return -1 ;
    }
    return st[top];
 }

 void pop(){
    if( top == -1){
        System.out.println("empty stack");
        return;
    }
    top = top -1;
 }

 int size(){
    return top + 1;
 }

 public static void main(String[] args) {
     stackUsingArrays st = new stackUsingArrays();

    st.push(10);
    st.push(20);
    st.push(30);

    System.out.println("Top: " + st.top());
    System.out.println("Size: " + st.size());

    //delete the top element
    st.pop();

    System.out.println("Top after pop: " + st.top());
    System.out.println("Size after pop: " + st.size());

    //to print all element in stack
    for( int i = st.top; i>=0 ; i--){
        System.out.print(st.st[i] + " ");
    }
 }

}
