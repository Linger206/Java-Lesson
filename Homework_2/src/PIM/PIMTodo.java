package PIM;

/**
 * @author 吴家明
 * 15130110076
 */

public class PIMTodo extends PIMEntity implements DateInterface{
    private String date;
    private String text;

//    PIMTodo(String p, String d, String t){
//        setPriority(p);
//        this.date = d;
//        this.text = t;
//    }

    @Override
    public void fromString(String s) {
        String[] args = s.split("#");
        setPriority(args[0]);
        this.date = getDate(args[1]);
        this.text = args[2];
    }

    @Override
    public String toString() {
        return getPriority() + " " + date + " " + text;
    }

    @Override
    public String getDate(String date) {
        return date;
//        SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
//        Calendar calendar = Calendar.getInstance();
//        try {
//            Date d = sf.parse(date);
//            calendar.setTime(d);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    public String getClassName() {
        return "TODO";
    }
}
