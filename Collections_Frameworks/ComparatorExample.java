//package Collections_Frameworks;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Student {
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
//class NameComparator implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.getName().compareTo(s2.getName());
//    }
//}
//
//class AgeComparator implements Comparator<Student> {
//    @Override
//    public int compare(Student s1, Student s2) {
//        return Integer.compare(s1.getAge(), s2.getAge());
//    }
//}
//
//public class ComparatorExample {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Alice", 22));
//        students.add(new Student("Bob", 20));
//        students.add(new Student("Charlie", 21));
//
//        // Sort by name using Comparator
//        Collections.sort(students, new NameComparator());
//
//        System.out.println("Sorted by name:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        // Sort by age using Comparator
//        Collections.sort(students, new AgeComparator());
//
//        System.out.println("\nSorted by age:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//}
//
