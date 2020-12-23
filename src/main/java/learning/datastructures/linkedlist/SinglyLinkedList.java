package learning.datastructures.linkedlist;

import learning.datastructures.linkedlist.SinglyLinkedList.Node;

import static java.lang.System.out;

public class SinglyLinkedList {
    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public void addFirst(int val) {
        Node newNode = new Node(val, null);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int val) {
        //create a new node
        Node newNode = new Node(val, null);
        //iterate till the last element from head.
        Node temp = head;
        if (head == null)
            head = newNode;
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        out.print("List: ");
        Node temp = head;
        while (temp != null) {
            out.print("," + temp.data);
            temp = temp.next;
        }
        out.println();
    }

    public void addAtPos(int val, int pos) {
        //Create a new node.
        Node newNode = new Node(val, null);
        //Insert an element at the first position
        if (head == null || pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        //Iterate to the position - 1
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == null)
                break;
            temp = temp.next;
        }
        //Point the new node to the position element.
        newNode.next = temp.next;
        //Point the position-1 element to the new node.
        temp.next = newNode;
        //Insert an element at the last position
    }

    public void delFirst() {
        if (head == null)
            return;
        head = head.next;
    }

    void delLast() {
        //iterate to the last element keeping another pointer to last-1.
//        i = last;
//        j = last-1
        if (head == null || head.next == null)
            delFirst();
        Node i = head;
        Node j = head;
        while (i.next != null) {
            j = i;
            i = i.next;
        }
        j.next = null;
    }

    public void delAtPos(int pos) {
        if (head == null || head.next == null || pos == 1) {
            delFirst();
            return;
        }
        if (pos < 1)
            throw new RuntimeException("Invalid position " + pos);
        Node i = head;
        //iterate to the position-1
        for (int k = 1; k < pos - 1; k++) {
            i = i.next;
            if (i == null)
                throw new RuntimeException("Invalid position " + pos);
        }
        Node j = i.next;
        if (j == null)
            throw new RuntimeException("Invalid position " + pos);
        i.next = j.next;
    }


    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.addLast(11);
        l1.addLast(22);
        l1.addLast(33);
        l1.addLast(44);
        l1.display();
        l1.addAtPos(55, 5);
        l1.display();
        l1.addAtPos(55, 2);
        l1.display();
        l1.addAtPos(111, 1);
        l1.display();
        l1.delFirst();
        l1.display();
        l1.delAtPos(2);
        l1.display();
//		l1.delLast();
//        l1.display();
//        l1.addAtPos(55, 6);
        //l1.deleteAll();
        //l1.display();
    }
}
