package PIM;

/**
 * @author 吴家明
 * 15130110076
 */

public class PIMContact extends PIMEntity {
    private String firstname;
    private String lastneme;
    private String emailadd;

    @Override
    public void fromString(String s) {
        String[] args = s.split("#");
        setPriority(args[0]);
        this.firstname = args[1];
        this.lastneme = args[2];
        this.emailadd = args[3];
    }

    @Override
    public String toString() {
        return getPriority() + " " + firstname + " " + lastneme + " " + emailadd;
    }

    public String getClassName() {
        return "CONTACT";
    }
}
