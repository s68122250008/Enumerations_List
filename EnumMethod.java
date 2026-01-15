

public class EnumMethod {

    public static void main(String[] args) {

        System.out.println("List all days:");
        for (Day day : Day.values()) {
            System.out.println("- " + day);
        }
     
        Day friday = Day.FRIDAY;
        System.out.println("Name: " + friday.name()); // output: FRIDAY
        System.out.println("Ordinal of Friday: " + friday.ordinal()); // output: 4
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
