
public class InstCounter {

    private static int counter; // ค่าเริ่มต้น 0

    public InstCounter() {
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(InstCounter.getCounter()); // 0
        // InstCounter a1 = new InstCounter(); //มีการสร้าง obj = counter++
        System.out.println(InstCounter.getCounter()); // 1
    }
}
