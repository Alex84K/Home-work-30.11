package ait.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompareAppl {
    public static void main(String[] args) {
        for (int i = 0; i < args[0].length(); i++) {
            //System.out.println(args[0][i]);
        }
        if(args.length != 2) {
            System.out.println("Wrong!!!");
            return;
        }
//        if(args[0].length() != args[1].length()) { ...оказывается так не работает :(
//            System.out.println("Wrong!!!");
//            return;
//        }

        System.out.println("Sorts: " + args[0]);
        System.out.println("Destination: " + args[1]);
        try(FileInputStream fin = new FileInputStream(args[0]); FileInputStream fin1 = new FileInputStream(args[1])) {
            int a = fin.read();
            int b = fin1.read();
            while (a != -1) {
                a = fin.read();
                b = fin1.read();
                if(a != b){
                    System.out.println("Sorry! These files are different...)))");
                    return;
                }
            }
            System.out.println("OK!These files are the same!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
