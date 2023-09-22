/**
 * SinglyLinkedList.java
 */

package datastructures;

public class SinglyLinkedList<T> {

    Node<T> head = null;

    /**
     * addFront
     * 
     * @param data
     */
    void addFront(T data) {
        if (head == null)
            head = new Node<T>(data);
        else {
            Node<T> newNode = new Node<T>(data);
            head.next = newNode;
            head = newNode;
        }
    }

    class Node<T> {

        T data;

        Node<T> next;

        Node(T data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addFront(1);
        list.addFront(2);
        list.addFront(3);
    }

}