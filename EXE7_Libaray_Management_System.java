package Advanced_java;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;
import java.time.*;

class Library{
    LocalDateTime tp = LocalDateTime.now();
    DateTimeFormatter xr =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String date = tp.format(xr);
    Calendar c = Calendar.getInstance();
    ArrayList<String> bk = new ArrayList<>(50);
    ArrayList<String> user = new ArrayList<>(50);
    String name;

    Scanner sc = new Scanner(System.in);
    public void getRegistered(){
        try {
            System.out.println("Welcome to the library Get Registered to Access the Library");
            System.out.println("Enter number of the users you want to add");
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Enter your name");
                name = sc.next();
                user.add(name);
                System.out.println(name + " Registered successfully");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    public void books() {
       if(user.contains(name)) {
           System.out.println("WELCOME TO THE LIBRARY");

           bk.add("1.Story book");
           bk.add("2.Science book");
           bk.add("3.Physiology book");
           bk.add("4.Computer Science book");
           bk.add("5.Biology Book");
           bk.add("6.Business book");
           bk.add("7.Communication-Skills book");
           bk.add("8.Information technology book");
           bk.add("9.Fantasy book");
           bk.add("10.Spiritual book");
           for (String lib : bk) {
               System.out.println(lib);
           }
       }
       else{
           System.out.println("Sorry you are not registered\nKindly Register to access the library");
       }
    }
    public void addbooks() {
        if(user.contains(name)) {
            System.out.println("Enter the number of books you want to add");
            int z = sc.nextInt();
            System.out.println("Enter name of the book");
            String name = sc.next();
            for (int i = 0; i < z; i++) {
                bk.add(name);
            }
        }
        else{
            System.out.println("Sorry you are not registered\nKindly Register to access the library");
        }


    }

    public void issuebooks(){
        if(user.contains(name)) {
            System.out.println("WELCOME TO THE LIBRARY");
            bk.add("1.Story book");
            bk.add("2.Science book");
            bk.add("3.Physiology book");
            bk.add("4.Computer Science book");
            bk.add("5.Biology Book");
            bk.add("6.Business book");
            bk.add("7.Communication-Skills book");
            bk.add("8.Information technology book");
            bk.add("9.Fantasy book");
            bk.add("10.Spiritual book");
            for (String xsr : bk) {
                System.out.println(xsr);
            }
            System.out.println("Enter name of the book you want to issue");
            String nameb = sc.next();
            System.out.println("Enter your name");
            String name = sc.next();
            System.out.println("Book name: " + nameb +"\nBook Author: Jack Maa" +"\nIssued to " + name + "\nIssued on " + date);
        }
        else{
            System.out.println("Sorry you are not registered\nKindly Register to access the library");
        }
    }
    public void returnbook(){
        System.out.println("WELCOME TO THE LIBRARY");
        bk.add("1.Story book");
        bk.add("2.Science book");
        bk.add("3.Physiology book");
        bk.add("4.Computer Science book");
        bk.add("5.Biology Book");
        bk.add("6.Business book");
        bk.add("7.Communication-Skills book");
        bk.add("8.Information technology book");
        bk.add("9.Fantasy book");
        bk.add("10.Spiritual book");
        for (String xsr : bk) {
            System.out.println(xsr);
        }
        System.out.println("Enter name of the book you want return");
        String bookName = sc.next();
        System.out.println("Enter your name");
        String n = sc.next();
        System.out.println("Book returned successfully");

    }
}

public class EXE7_Libaray_Management_System {
    public static void main(String[] args) {
        /* Create a library management system which is capable of issuing book
        to the students
        Book should have the following info:
        1. Book name
        2. Book author
        3. issued to
        4. Issued on
        User should be able to add book , return issued book , issue book
        Assume that all users are registered with thier names.
         */
        Library lr = new Library();
//        lr.addbooks();
//        lr.books();
//        lr.getRegistered();
        lr.returnbook();



    }

}
