public class Array2LL{
    public static class Node{
         int data;
         Node next;

         public Node( int data , Node next){
            this.data = data;
            this.next = next;
         }

         public Node( int data){
            this.data = data;
            this.next = null;
         }

         private static Node arr2ll( int []arr){
            Node head = new Node(arr[0]);
            Node mover = head;

            for( int i = 1 ; i < arr.length ; i++){
                Node temp = new Node(arr[i]);
                mover.next= temp;
                mover = temp;
            }
            return head;
         }

         private static int size(Node head){
            int count = 0 ; 
            Node temp = head;
            while( temp != null){
                temp = temp.next;
                count++;
            }
            return count;
         }

         private static int check(Node head , int target ){
            Node temp = head;
            while( temp != null){
                if( temp.data == target){
                    return 1;
                }
                temp = temp.next;
            }
            return 0;
         }

         private static void print(Node head){
            Node temp = head;
            while( temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
         }

         private static Node removeHead(Node head){
            if( head == null){
                return head;
            }

            Node temp = head;
            head = head.next;

            return head;
         }

         private static Node removeTail(Node head){
            if( head == null || head.next == null){
                return null;
            }

            Node temp = head;
            while( temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
         }

         private static Node removeK(Node head , int k){
            if( head == null ){
                return head;
            }
            if( k == 1){
                Node temp = head;
                head = head.next;
                return head;
            }
            
            Node temp = head;
            Node  prev = null;
            int count = 0;

            while( temp != null){
                count++;
                if( count == k){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
         }

         private static Node removeElement( Node head , int element){
            if( head == null){
                return head;
            }

            if( head.data == element){
                head = head.next;
                return head;
            }

            Node temp = head;
            Node prev = null;
            int count = 0;

            while( temp != null){
                count++;

                if(count == element){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
         }

         private static Node addhead(Node head , int val){
           Node temp = new Node(val,head);
           return temp;
         }

         private static Node addTail(Node head , int val){
            if( head == null){
                return head;
            }

            Node temp = head;

            while( temp.next != null){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            temp.next = newNode;
            return head;
         }

         private static Node insertPosition(Node head , int el, int k){
            if( head == null){
                if( k == 1){
                    return new Node(el);
                }else{
                    return null;
                }
            }

             if( k == 1){
                return new Node(el, head);
            }

            int count = 0;
            Node temp = head;

            while( temp != null){
                count++;
                if( count == k-1){
                    Node x = new Node(el , temp.next);
                    temp.next = x;
                    break;
                }
            }
            return head;
         }

         private static Node insertbeforevalue(Node head , int el, int val){
            if( head == null){
                return null;
            }

            if( head.data == val){
                return new Node(el,head);
            }

            Node temp = head;
            while( temp.next != null){
                if(temp.next.data == val){
                    Node x = new Node(el, temp.next);
                    temp.next = x;
                    break;
                }
                temp = temp.next;
            }
            return head;
         }
    }
}

    public static void main(String[] args) {
        int arr[] = {18,17,1,15,21,33};

        Node head = convertArr2LL(arr);
        System.out.println(head.data);

        Node temp = head;

        while( temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Length of linked list: " + length(head));

        int valueToCheck = 8;
        int isPresent = checkifPresent(head, valueToCheck);
        System.out.println("Is " + valueToCheck + " present in the linked list? " + (isPresent == 1 ? "Yes" : "No"));

        head = removeHead(head);
        print(head);

        head = removeTail(head);
        print(head);

        head = removeK(head,4);
        print(head);

        head = removeElement(head, 18);
        print(head);

        head = addHead(head, 100);
        print(head);

        head = addTail(head, 200);
        print(head);

        head = insertPostion(head, 500, 2);
        print(head);

        head = insertBeforeValue(head, 1000, 15);
        print(head);    
    }
}
