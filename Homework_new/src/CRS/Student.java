package CRS;

/**
 * @author 吴家明
 * 15130110076
 */

public class Student {
    private String snum;    //student number
    private String[] course = new String[10];

    Student() { }
    Student(String snum) {//constructor with student number only
        this.snum = snum;
    }
    Student(String[] args) {//constructor with one or multiple courses
        this.snum = args[0];
        System.arraycopy(args, 1, this.course, 0, args.length-1);
    }

    public void print() {
        System.out.print(this.getSnum() + " select ");
    }

    public String getSnum() {
        return snum;
    }

    public String[] getCourse() {
        return course;
    }
}
