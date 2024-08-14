//package Collections_Frameworks;
//
//import java.util.EnumSet;
//import java.util.HashSet;
//import java.util.Set;
//
//enum Day {
//    MONDAY, AFROZDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//}
//
//
//
//public class EnumSetExample {
//    public static void main(String[] args) {
//        // Create an EnumSet containing MONDAY, WEDNESDAY, and FRIDAY
//        EnumSet<Day> workDays = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
//        System.out.println("Workdays: " + workDays);
//
//        // Create an EnumSet containing all days of the week
//        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
//        System.out.println("All days: " + allDays);
//
//        // Create an empty EnumSet
//        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
//        System.out.println("No days: " + noDays);
//
//        // Add elements to the empty EnumSet
//        noDays.add(Day.SUNDAY);
//        System.out.println("After adding Sunday: " + noDays);
//
//        // Range-based EnumSet
//        EnumSet<Day> weekendDays = EnumSet.range(Day.SATURDAY, Day.SUNDAY);
//        System.out.println("Weekend days: " + weekendDays);
//
//        // Remove elements from the EnumSet
//        workDays.remove(Day.WEDNESDAY);
//        System.out.println("Workdays after removing Wednesday: " + workDays);
//
//        EnumSet<Day> Afroz = EnumSet.of(Day.AFROZDAY);
//        System.out.println("Workdays: " + Afroz);
//
//
//    }
//}
//
