package com.codegym.task.task21.task2110;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/*
Refactoring methods
Refactor the writeZipEntriesToFile method to use the Java 7 try-with-resources construct.
The program should not have commented code.

Requirements:
•	The writeZipEntriesToFile method must be declared with the public access modifier.
•	The writeZipEntriesToFile method must be static.
•	The writeZipEntriesToFile method must be void.
•	The writeZipEntriesToFile method must use try-with-resources correctly.
*/

public class Solution {
    public static void writeZipEntriesToFile(String zipFileName, String outputFileName) {
        Charset charset = StandardCharsets.UTF_8;
        Path outputFilePath = Paths.get(outputFileName);

        try (
                ZipFile zip = new ZipFile(zipFileName);
                BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)
        ) {
            String newLine = System.getProperty("line.separator");
            for (Enumeration entries = zip.entries(); entries.hasMoreElements(); ) {
                // Get the file name from the archive and write it to the output file
                String zipEntryName = ((ZipEntry) entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
        catch (Exception e){}
    }

    public static void main(String[] args) {

    }
}
