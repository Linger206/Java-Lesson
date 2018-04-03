package CRS;

import java.util.*;

/**
 * @author 吴家明
 * 15130110076
 */

public class Book {
    private List<String> list = new ArrayList<>();  //use for judgement in printing
    private Map<String, List> map = new HashMap<>();    //keys store Course Name, values store books

    Book(){ }
    Book(String course, List list) {
        this.list = list;
        map.put(course,list);
    }

    void print() {
        if (this.list.size() > 1)
            System.out.print("books ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if (i < list.size()-1)
                System.out.print(", ");
        }
//        System.out.print("; ");
    }

    public static Book createBooks(Course course) {
        Book book = new Book();
        switch (course.getCoursename()){
            case "Java" :
                List<String> listJava = new ArrayList<>();
                listJava.add("Thinking in Java");
                listJava.add("Java 8");
                book = new Book("Java", listJava);
                break;
            case "WebEngineering" :
                List<String> listWeb = new ArrayList<>();
                listWeb.add("Web Engineering");
                book = new Book("WebEngineering", listWeb);
                break;
        }
        return book;


    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Thinking in Java");
        list.add("Java 8");
        Book book = new Book("Java", list);
        book.print();
    }
}