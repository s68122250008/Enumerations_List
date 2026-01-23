package List;

public class TestNode {

    public static void main(String[] args) {
        // สร้าง Node
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        // เชื่อมต่อ Node แบบปกติ: 1 -> 2 -> 3 -> 4
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        // แทรก n5 ระหว่าง n2 และ n3
        Node temp = n3; // เก็บ n3 ไว้ก่อน
        n2.setNext(n5); // ให้ n2 ชี้ไปหา n5
        n5.setNext(temp); // ให้ n5 ชี้ไปหา n3 (ที่เก็บไว้ใน temp)

        Node current = n1; // เริ่มต้นที่ Node แรก

        while (current != null) {
            System.out.println("   Current Data = " + current.getData());
            System.out.println("   Address      = " + current);

            current = current.getNext();
        }

        System.out.println("Total Nodes: " + Node.getCount());
    }
}