public class Myqueue {
    Node head;
    Node tail;
    int size;
    public boolean isEmpty() {
        return (head == null);
    }

    public void enqueue(Node node) {
        if (isEmpty()) {
            head = tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public Node dequeue() {
        if (isEmpty()) {
            System.out.println("Ham doi rong");
            return null;
        } else {
            Node node = head;
            head = head.next;
            size--;
            return node;
        }
    }
    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            currentNode.printData();
            currentNode = currentNode.next;
        }
    }
}
