import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students= Arrays.asList(new Student("Priyanka",90),
                                              new Student("Priya",60),
                                              new Student("Suresh",80),
                                              new Student("Akshay",50),
                                              new Student("Ramesh",70));
        Comparator<Student> nameComparator=(n1,n2) -> n1.getName().compareTo(n2.getName());
        students.sort(nameComparator);
        System.out.println("Student name in alphabetic order");
        for (Student element:students){
            System.out.println(element);
        }

        System.out.println();
        System.out.println("-------------------------------------------------------" );

        Comparator<Student> markComparator=(m1,m2) -> m2.getMarks()- m1.getMarks();
        students.sort(markComparator);
        System.out.println("Student marks in descending order");
        for (Student element:students){
            System.out.println(element);
        }
    }
}
