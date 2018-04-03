
/**
 * @author 吴家明
 * 15130110076
 */

public class Substring {
    public static void main(String[] args) {
        int index = Integer.parseInt(args[1]);
        int length = Integer.parseInt(args[2]);
        System.out.println(
                args[0].substring(index, index+length));
    }
}
