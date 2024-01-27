package scratch1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class foo {
    public static void main(String[] args) {
        // sum up all the bytes in a file
        try {
            FileInputStream fileInputStream = new FileInputStream("scratch.txt");
            long sum = 0;
            while(fileInputStream.available()>0){
                int data = fileInputStream.read();
                sum += data;
            }
            fileInputStream.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
