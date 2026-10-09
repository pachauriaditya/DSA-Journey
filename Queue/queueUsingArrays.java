package Queue;

public class queueUsingArrays {
    int size = 10;
    int [] q = new int[size];
    int currSize = 0 ;
    int start = - 1;
    int end = - 1;

    void push(int x){
        if( currSize == size){
            System.out.println("cannot push");
            return ;
        }
        if( currSize == 0){
            start = 0 ;
            end = 0;
        }else{
            end = (end + 1) % size;
        }

        q[end] = x;
        currSize += 1;
    }
    int pop(){
        if( currSize == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int elem = q[start];
        if( currSize == 1){
            start = end = -1;
        }else
            start = (start + 1)% size;
            currSize -= 1;
            return elem;
    }

    int top(){
        if( currSize == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return q[start];
    }

    int sizee(){
        return currSize;
    }


    public static void main(String[] args) {

        queueUsingArrays q = new queueUsingArrays();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Top: " + q.top());

        System.out.println("Popped: " + q.pop());

        System.out.println("Top: " + q.top());

        System.out.println("Size: " + q.sizee());
    }
}

