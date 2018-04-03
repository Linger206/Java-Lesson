package CRS;

/**
 * @author 吴家明
 * 15130110076
 */

public class Test {
    public static void main(String[] args) {
        Student student = new Student(args);
        student.print();
//        for (String s : student.getCourse())
//            System.out.println(s);
        int length = args.length - 1;
        for (int i = 0; i < length; i++) {
            Course course = new Course(student.getCourse()[i]);
            course.print();
            Book book = Book.createBooks(course);
            book.print();
            if (i != length-1) System.out.print("; and ");
        }
    }
}
