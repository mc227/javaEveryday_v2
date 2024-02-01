package com.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Serializable Solution
Serialize the Solution class.
Think about which fields you don't need to serialize. Mark the unnecessary fields with the transient modifier.
The object must always contain up-to-date summary data.
The main method is not tested.



Requirements:
•	The pattern field must be marked with the transient modifier.
•	The currentDate field must be marked with the transient modifier.
•	The temperature field must be marked with the transient modifier.
•	The string field must NOT be marked with the transient modifier.
*/

public class Solution implements Serializable{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // Write the verification code yourself in the main method:
        // 1) create a file, open an input stream and an output stream;
        OutputStream outputStream = new FileOutputStream("markCostales.ser");
        InputStream inputStream = new FileInputStream("markCostales.ser");
        // 2) create an instance of the Solution class (savedObject);
        Solution savedObject = new Solution(4);
        // 3) write savedObject to the output stream (make sure that they're really there);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(savedObject);
        objectOutputStream.close();
        // 4) create another instance of the Solution class with a different argument;
        // 5) load an object from the input stream (loadedObject);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Solution loadedObject = (Solution) objectInputStream.readObject();
        objectInputStream.close();
        // 6) verify that savedObject.string is equal to loadedObject.string;
        System.out.println(savedObject.string.equals(loadedObject.string));

        // 7) handle exceptions.
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
