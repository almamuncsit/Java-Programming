package exceptions;

import java.io.*;

public class Exceptions {

    public static void main(String[] args) {
        int[] arr = {5, 45};
        FileReader fr = null;
        
        try {
            System.out.println(arr[3]);
            
            File file = new File("file.txt");
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a); // reads the content to the array
            for (char c : a) {
                System.out.print(c); //prints the characters one by one
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Array error : " + e);
        } finally {
            System.out.println("First element value: " + arr[0]);
        }
    }

}
