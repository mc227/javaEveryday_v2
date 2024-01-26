package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
The fillInPropertiesMap method should
call the load method, passing the
newly created FileInputStream as an argument.
*/

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        // Implement this method
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            try {
                load(fileInputStream);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        // Implement this method
    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method
    }

    public static void main(String[] args) {

    }
}
