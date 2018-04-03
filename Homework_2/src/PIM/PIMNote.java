package PIM;

/**
 * @author 吴家明
 * 15130110076
 */

public class PIMNote extends PIMEntity {
    private String text;

    @Override
    public void fromString(String s) {
        String[] args = s.split("#");
        setPriority(args[0]);
        this.text = args[1];
    }

    @Override
    public String toString() {
        return getPriority() + " " + text;
    }

    public String getClassName() {
        return "NOTE";
    }
}
