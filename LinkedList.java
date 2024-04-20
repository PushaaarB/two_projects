public class LinkedList<T> {

    private int length = 0;

    public Integer len() {return length;}

    private class Node {
        private T data;
        private Node prev;
        private Node next;

        public Node (Node prev, T data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    private Node first;
    private Node last;

    public LinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return (first == null);
    }

    public void push(T data) {
        if (isEmpty()) {
            first = new Node(null, data, null);
            last = first;
        } else {
            Node cur = new Node(last, data, null);
            last.next = cur;
            last = cur;
            }
        length ++;
        }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Список пустой");
        } else {
            last = last.prev;
        }
        length --;
    }

    public void unshift(T data) {
        if (isEmpty()) {
            first = new Node(null, data, null);
            last = first;
        } else {
            Node cur = new Node(null, data, first);
            first.prev = cur;
            first = cur;
        }
        length ++;
    }

    public void shift() {
        if (isEmpty()) {
            System.out.println("Список пустой");
        } else {
            first = first.next;
        }
        length --;
    }

    public void print(Integer index) {
        if (index < length) {
            Node link = first;
            for (int i = 0; i < index; i++) {
                link = link.next;
            }

            System.out.println(link.data);
        }
    }
}
