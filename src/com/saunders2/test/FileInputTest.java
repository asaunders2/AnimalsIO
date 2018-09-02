package com.saunders2.test;

import com.saunders2.FileInput;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.Assert.*;

public class FileInputTest extends TestCase {

    FileInput fInput;

    @Before
    public void setUp() throws Exception {

        fInput = new FileInput("animalsIO.txt");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFileReadLine() {
        assertNotNull(fInput.fileReadLine());
        assertNotNull(fInput.fileReadLine());
        assertNotNull(fInput.fileReadLine());
        assertNull(fInput.fileReadLine());
    }

    @Test
    public void fileClose() {
        fInput.fileClose();
    }
}
