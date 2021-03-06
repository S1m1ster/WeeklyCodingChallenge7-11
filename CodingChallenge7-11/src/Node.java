public class Node {
    public int value;
    public Node next;

    public Node(Node next){
        this.next = next;
    }

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +"\n" +
                "value=" + value +
                '}';
    }
}
