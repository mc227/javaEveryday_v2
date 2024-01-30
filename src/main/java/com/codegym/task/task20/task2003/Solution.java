package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Introducing properties

*/

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream in = new FileInputStream(filename);
        load(in);
        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            prop.setProperty(entry.getKey(), entry.getValue());
        }
        prop.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();
        prop.load(inputStream);
        for (Map.Entry<Object, Object> entry : prop.entrySet()) {
            properties.put(entry.getKey().toString(), entry.getValue().toString());
        }
        inputStream.close();
    }

    public static void main(String[] args) {
        try {
            Solution solution = new Solution();
            solution.fillInPropertiesMap();

            // Example: Printing the properties after loading
            System.out.println("Properties:");
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
