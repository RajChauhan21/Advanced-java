package Advanced_java;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class CH16_File_Handling {
    public static void main(String[] args)  {
        // code for creating a new file
        File cr = new File("craj.txt");
//        try {
//            cr.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create a file");
//            throw new RuntimeException(e);
//        }

        // code for writing in a file
//        try {
//            FileWriter fw = new FileWriter("craj.txt");
//            fw.write();
//            fw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Reading a file
//        try {
//            Scanner xr = new Scanner(cr);
//            while(xr.hasNextLine()){
//                System.out.println(xr.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //Deleting a file
//        File cr = new File("craj.txt");
//        cr.delete();


    }
}
