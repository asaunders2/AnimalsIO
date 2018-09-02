package com.saunders2;

import java.io.*;

/** Defines the attributes and behavior of the FileOutput object
 * @author mgreen14
 * @author asaunders2
 * @version 1.2, 9/2/2018
 */
public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     *
     * @param fileName is a string showing the file name to be used when opening a file
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     *
     * @param line is a string represents one line of a file
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * closes the file
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}