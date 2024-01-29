package scratch1;

import java.io.*;

public class FileDivide {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

       try(FileInputStream inputStream = new FileInputStream(inputFile);
           FileOutputStream outputStream1 = new FileOutputStream(outputFile1);
           FileOutputStream outputStream2 = new FileOutputStream(outputFile2)){

           int halfOfFile = (inputStream.available()+1)/2;
           int numberOfByte = 0;
           while(inputStream.available() > 0) {
               if(numberOfByte < halfOfFile){
                   outputStream1.write(inputStream.read());
                   numberOfByte++;
               } else {
                   outputStream2.write(inputStream.read());
               }
           }
       }
    }
}
