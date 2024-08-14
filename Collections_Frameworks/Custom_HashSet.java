//package Collections_Frameworks;
//
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//
//class  Student{
//    int rollNo;
//    String name;
//
//    Student(int rollNo,String name){
//        this.rollNo=rollNo;
//        this.name=name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "rollNo=" + rollNo +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        Student student = (Student) o;
////        return rollNo == student.rollNo;
////    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(rollNo);
//    }
//}
//
//public class Custom_HashSet {
//    public static void main(String[] args) {
//
//      Set<Student>st1=new HashSet<>();
//
//     Student stu1=new Student(10,"Afroz");
//     Student stu2=new Student(10,"Kafil Ahmad");
//
//        System.out.println(stu1.equals(stu2));
//
//
//
//
//        st1.add(new Student(4,"Alam"));
//        st1.add(new Student(1,"Anuj JCB"));
//        st1.add(new Student(1,"Anuj JCB"));
//        st1.add(new Student(1,"Anuj JCB"));
//        st1.add(new Student(5,"Dani Daniels"));
//        st1.add(new Student(19,"KK Bhai"));
//
//
//        System.out.println(st1);
//
//
//    }
//}
