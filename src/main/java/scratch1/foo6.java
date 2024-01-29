package scratch1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class foo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("data.txt");
        FileOutputStream outputStream = new FileOutputStream("result.txt");

        while(inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }
}
