public class Queue {
    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, tailNode;

    public Queue() {
        headNode = tailNode = null;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (headNode == null && tailNode == null) {
            headNode = tailNode = node;
        } else {
            tailNode.next = node;
            tailNode = node;
        }
    }

    public int get() {
        if (headNode == null && tailNode == null) {
            return -1;
        }
        int value = headNode.value;
        if (headNode == tailNode) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }
        return value;
    }

    public void show() {
        if (headNode == null && tailNode == null) {
            System.out.println("Queue rỗng");
            return;
        }
        Node curNode = headNode;
        while (curNode != null) {
            System.out.print(curNode.value + "");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public void getQueue() {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        show();
        get();
    }



}
