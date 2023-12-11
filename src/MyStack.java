public class MyStack {
    Node head;
    int size;

    public MyStack() {
        this.head = head;
        this.size = size;
    }
    boolean isEmpty() {
        return (head == null);
    }

    public void push(Node node) {
        node.next = head;
        head = node;
    }
    public Node pop() {
        if (isEmpty()) {
            System.out.print("Empty list!");
            return null;
        } else {
            Node node = head;
            head = head.next;
            return node;
        }
    }
    public Node peek(Node node) {
        if (isEmpty()) {
            System.out.print("Empty list!");
            return null;
        } else {
            return head;
        }
    }
    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.next);
            currentNode = currentNode.next;
        }
    }
}
