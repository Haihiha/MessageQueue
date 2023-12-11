public class Node {
    private String content;
    Node next;

    public Node(String content) {
        this.content = content;
        this.next = null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void printData() {
        System.out.println(this.getContent());
    }
}