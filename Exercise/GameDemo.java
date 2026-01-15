package Exercise;
public class GameDemo {

    public static void main(String[] args) {
        GameCharacter c1 = new GameCharacter("Aragon", "Warrior", PowerLevel.HIGH);
        c1.displayInfo();
        System.out.println("-----------");
        GameCharacter c2 = new GameCharacter("Elena", "Mage", PowerLevel.MEDIUM);
        c2.displayInfo();
        System.out.println("-----------");

        GameCharacter c3 = new GameCharacter("Luna", "Archer", PowerLevel.LEGENDARY);
        c3.displayInfo();
        System.out.println("-----------");

        System.out.println("Total characters in game: " + GameCharacter.getTotalCharacters());
    }
}

// TODO 3:
// คลาสหลักส าหรับทดสอบโปรแกรม
// TODO 3.1:
// สร้างตัวละครอย่างน้อย 3 ตัว
// ตัวอย่าง:
// GameCharacter c1 = new GameCharacter("Aragon", "Warrior", PowerLevel.HIGH);
// TODO 3.2:
// เรียกใช้ displayInfo() ของตัวละครแต่ละตัว
// TODO 3.3:
// แสดงจ านวนตัวละครทั้งหมดในเกม
// ตัวอย่าง:
// System.out.println("Total characters in game: " +
// GameCharacter.getTotalCharacters());
