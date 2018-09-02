package com.saunders2.test;

import com.saunders2.FileInput;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class FileInputTest extends TestCase {

    BufferedReader bReader = null;
    String line;

    FileReader fReader;

    @Before
    public void testSetUp() throws Exception {
        
        try {
            fReader = new FileReader("animalsIO.txt");
            bReader = new BufferedReader(fReader);

            while((line = bReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() throws Exception {
    }

}