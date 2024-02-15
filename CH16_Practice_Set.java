package Advanced_java;

import java.io.FileWriter;
import java.io.IOException;

class flask{
    @Deprecated
    public void exe(){
        System.out.println("I am a deprecated method");
    }
}
interface ins{
    public void mtr();
}
public class CH16_Practice_Set {
    public static void main(String[] args)  {
        @SuppressWarnings("Deprecation") //Que 3
    //Que 1 - create a java doc of a java program using and without using intellij idea
        //Que 2 - create a class and add a method with deprecated annotation , what will be it's effect on
        //program
//        flask cl = new flask();
//        cl.exe(); //No effects
        //Que 4 - Create an interface and generate an instance(also known as object) from it
//        ins xr =  new ins() {
//            @Override
//            public void mtr() {
//                System.out.println("Instance(Object) of the interface has been created");
//            }
//        };
//        xr.mtr();

        //Que 5 - print a multiplication table and write it in a file
//        int tab = 15;
//        String ab = " ";
//        for (int i = 1; i<=10;i++){
//            ab += ( tab + " x " + i + " = " + tab*i);
//            ab += "\n";
//        }
//        try {
//            FileWriter fw = new FileWriter("Multiplication.txt");
//            fw.write(ab);
//            fw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Que 6 - same as que 5 print table from 2 - 9 and save these tables into a folder
        int tab = 9;
        String ab = " ";
        for (int i = 1; i<=10;i++){
            ab += ( tab + " x " + i + " = " + tab*i);
            ab += "\n";
        }
        try {
            FileWriter fw = new FileWriter("Multiplication9.txt");
            fw.write(ab);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
