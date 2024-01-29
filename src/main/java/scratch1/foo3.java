package scratch1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class foo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("scratch.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("result.txt");

        byte[] buffer = new byte[1000];
        while(fileInputStream.available() > 0){
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer,0,count);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
