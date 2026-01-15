package Exercise;

public class GameCharacter {

    String name;
    String role;
    PowerLevel powerLevel;

    private static int counter;

    public GameCharacter(String name, String role, PowerLevel powerLevel) {
        this.name = name;
        this.role = role;
        this.powerLevel = powerLevel;
        counter++;
    }

    public static int getTotalCharacters() {
        return counter;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
        System.out.println("Power Level: " + this.powerLevel);
    }
}

// TODO 2.1:
// ประกาศตัวแปร instance
// - name (String)
// - role (String)
// - powerLevel (PowerLevel)
// TODO 2.2:
// ประกาศ static variable เพื่อนับจ านวนตัวละครทั้งหมด
// TODO 2.3:
// เขียน constructor รับค่า name, role, powerLevel
// และเพิ่มค่าจ านวนตัวละคร
// TODO 2.4:
// เขียน static method getTotalCharacters()
// คืนค่าจ านวนตัวละครทั้งหมด
// TODO 2.5:
// เขียน method displayInfo()
// แสดงข้อมูลตัวละคร:
// Name:
// Role:
// Power Level:
// ----------------------
