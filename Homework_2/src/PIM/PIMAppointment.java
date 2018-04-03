package PIM;

/**
 * @author 吴家明
 * 15130110076
 */

public class PIMAppointment extends PIMEntity implements DateInterface{
    private String description;
    private String date;

    @Override
    public void fromString(String s) {
        String[] args = s.split("#");
        setPriority(args[0]);
        this.date = getDate(args[1]);
        this.description = args[2];
    }

    @Override
    public String toString() {
        return  getPriority() + " " + date + " " + description;
    }

    @Override
    public String getDate(String date) {
        return date;
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
//        Calendar calendar = Calendar.getInstance();
//        try {
//            Date d = sf.parse(date);
//            calendar.setTime(d);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    public String getClassName() {
        return "APPOINTMENT";
    }
}
