package List;

public class TestNode {

    public static void main(String[] args) {

        // 1. สร้าง Node ขึ้นมา 2 ตัว (ยังแยกกันอยู่ อิสระจากกัน)
        System.out.println("Before "); // Before
        System.out.println("number of Obj = " + Node.getCount()); // 0
        Node n1 = new Node(1); // n1 เก็บเลข 1
        Node n2 = new Node(2); // n2 เก็บเลข 2

        System.out.println("n1 = " + n1); // ที่อยู่ของ n1

        // ตอนนี้ n1 ยังไม่ชี้ใคร ค่าที่ได้จะเป็น null
        System.out.println("next of n1 " + n1.getNext());

        System.out.println("n2 = " + n2);
        System.out.println("next of n2 " + n2.getNext());

        System.out.println("After "); // ปริ้นสถานะหลังเชื่อม
        System.out.println("number of Obj = " + Node.getCount()); // 2

        n1.setNext(n2);
        System.out.println("next of n1 = " + n1.getNext());
        System.out.println("next of n2 = " + n2.getNext());

        Node n3 = new Node(3); // n3 เก็บเลข 3
        Node n4 = new Node(4); // n4 เก็บเลข 4
        n2.setNext(n3);
        n3.setNext(n4);
        Node n5 = new Node(5); // n5 เก็บเลข 5
        Node temp = n3;
        n2.setNext(n5);
        n5.setNext(temp);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);

        System.out.println("next of n1 = " + n1.getNext());
        System.out.println("next of n2 = " + n2.getNext());
        System.out.println("next of n3 = " + n3.getNext()); // n5 แทรกกลาง
        System.out.println("next of n4 = " + n4.getNext()); // null
        System.out.println("next of n5 = " + n5.getNext());
    }
}
