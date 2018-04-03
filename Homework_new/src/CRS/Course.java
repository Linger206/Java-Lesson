package CRS;

/**
 * @author 吴家明
 * 15130110076
 */

public class Course {
    private String coursename = null;

    Course() {  }
    Course(String course) {
        this.coursename = course;
    }

    public void print() {
        System.out.print(this.coursename + " with ");
    }

    public String getCoursename() {
        return coursename;
    }
}
