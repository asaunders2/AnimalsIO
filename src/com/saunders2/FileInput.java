package com.saunders2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** Defines the attributes and behavior of the FileInput object
 * @author mgreen14
 * @author asaunders2
 * @version 1.2, 9/2/2018
 */

public class FileInput {

    private BufferedReader in = null;
    private String fileName;

    /**
     * Constructs a new FileInput with a fileName passed in as a parameter
     * @param  fileName              string that holds the name of the file to be opened
     * @throws FileNotFoundException if the file was not found an error will be displayed
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /** Reads the file that is passed in
     * @param line                   string that is used as a flag to determine if the file is empty at some point
     * @throws FileNotFoundException if the file is not found it will notify that the user cannot write to that file
     */
    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    /**
     * Reads each line of the file and returns it
     * @return returns a string showing information from a line
     * @return returns a string error message if the line can't be read
     */
    public String fileReadLine() {
        try {
            String line = in.readLine();
            return line;
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * closes the file when the end of the file is reached
     * @throws IOException general exception thrown if input or output is bad
     */
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}