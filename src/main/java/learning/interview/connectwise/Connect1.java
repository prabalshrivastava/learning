package learning.interview.connectwise;

import static java.lang.System.*;

public class Connect1 {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (i % 15 == 0)
//                out.println("fizzbuzz");
//            else {
//                if (i % 3 == 0)
//                    out.println("fizz");
//                else if (i % 5 == 0)
//                    out.println("buzz");
//                else
//                    out.println(i);
//            }
//        }

//        LinkedList linkedList = new LinkedList();
//        linkedList.add(10);
//        linkedList.add(20);
//        linkedList.add(30);
//        linkedList.add(40);
//        linkedList.add(50);
//        linkedList.add(60);
//        linkedList.print();
//        out.println(linkedList.findAtPos(3).data);

        int a = 10;
        int b = 5;
        a = a + b; //15
        b = a - b; //15 - 5 = 10
        a = a - b; //15 - 10 = 5
    }
}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        //create
        Node node = new Node(data, null);
        if (head != null)
            node.next = head;
        head = node;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            out.println(temp.data);
            temp = temp.next;
        }
    }

    Node findAtPos(int pos) {
        Node temp = head;
        for (int i = 0; i < pos; i++) {
            if (temp != null)
                temp = temp.next;
            else
                return null;
        }
        return temp;
    }
}
