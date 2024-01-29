package scratch1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class foo7 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("data.txt");
        FileOutputStream outputStream = new FileOutputStream("result.txt");

        byte[] buffer = new byte[1000];
        while(inputStream.available() > 0){
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
