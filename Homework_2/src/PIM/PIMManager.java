package PIM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 吴家明
 * 15130110076
 */

public class PIMManager {
    private static List<PIMEntity> l = new ArrayList<>();    //temporarily store data when "creating"
    private static List<PIMEntity> list = new ArrayList<>();    //save data when "saving", need to be changed with files later

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("Welcome to PIM.");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("---Enter a command (Supported commands are List Create Save Load Quit, Case-insensitive)---");
            String command = in.next().toLowerCase();
            switch (command) {
                case "list" :   list();   break;
                case "create" : create();   break;
                case "save" : save(); break;
                case "read" : read(); break;
                case "quit" :
                    System.out.println("PIM terminated. Goodbye.");
                    return;
                default:
                    System.out.println("Wrong command. Please try again.");
            }
        }
    }

    private static void list() {    //list
        System.out.println("There are " + l.size() + " items.");
        if (l.size() > 0) {
            for (int i = 0; i < l.size(); i++) {
                System.out.print("Items " + i + ": ");
                System.out.println(l.get(i).getClassName() + " "+l.get(i).toString());
            }
        }
    }

    private static void create() {  //create
        String arg = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an item type ( todo, note, contact or appointment )");
        switch (in.nextLine()) {
            case "todo" :
                System.out.println("Enter todo priority: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter date for todo item: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter todo text: ");
                arg += in.nextLine();
                PIMTodo todo = new PIMTodo();
                todo.fromString(arg);
                l.add(todo);
                break;
            case "note" :
                System.out.println("Enter note priority: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter note text: ");
                arg += in.nextLine();
                PIMNote note = new PIMNote();
                note.fromString(arg);
                l.add(note);
                break;
            case "appointment"  :
                System.out.println("Enter appointment priority: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter date for appointment item: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter appointment description : ");
                arg += in.nextLine();
                PIMAppointment appointment = new PIMAppointment();
                appointment.fromString(arg);
                l.add(appointment);
                break;
            case "contact"  :
                System.out.println("Enter contact priority: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter first name for contact: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter last name for contact: ");
                arg += in.nextLine() + "#";
                System.out.println("Enter contact email address : ");
                arg += in.nextLine();
                PIMContact contact = new PIMContact();
                contact.fromString(arg);
                l.add(contact);
                break;
            default:
                System.out.println("Wrong item type. Create failed. Terminated.");
        }

    }

    private static void save() {    //save
        list.addAll(l);
        System.out.println("Save complete.");
    }

    private static void read() {    //read
        PIMTodo todo = new PIMTodo();
        todo.fromString("urgent#04/20/2018#Submit Java homework.");
        l.add(todo);
        PIMNote note = new PIMNote();
        note.fromString("urgent#Submit Java homework.");
        l.add(note);
        PIMAppointment appointment = new PIMAppointment();
        appointment.fromString("normal#04/03/2018#fuck");
        l.add(appointment);
        PIMContact contact = new PIMContact();
        contact.fromString("urgent#John#Wick#jw@gmail.com");
        l.add(contact);

        System.out.println("Read complete.");
    }

}
