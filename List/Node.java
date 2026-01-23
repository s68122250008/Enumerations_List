package List;

class Node {
    private int data;
    private Node next;
    private static int count;

    public Node(int dataValue) {
        data = dataValue;
        next = null;
        ++count;
    }

    public Node(int dataValue, Node nextValue) {
        data = dataValue;
        next = nextValue;
        ++count;
    }

    public static int getCount() {
        return count;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int dataValue) {
        data = dataValue;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }
}