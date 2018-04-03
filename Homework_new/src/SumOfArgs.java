/**
 * @author 吴家明
 * 15130110076
 */

public class SumOfArgs {
    public static void main(String[] args) {
        int res = 0;
        label :
        for (String s : args){
            char[] c = s.toCharArray();
            for (char ch : c)
                if (!Character.isDigit(ch))
                    continue label;
            res += Integer.parseInt(s);
        }
        System.out.println(res);
    }
}
