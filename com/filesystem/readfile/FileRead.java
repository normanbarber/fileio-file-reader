package com.filesystem.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nbarber on 4/9/2014.
 */
public class FileRead {
    public static void main(String[] args) {

        BufferedReader bufferRead = null;

        try {
            String cssLineOfCode;
            bufferRead = new BufferedReader(new FileReader("path\\to\\file\\"));

            while ((cssLineOfCode = bufferRead.readLine()) != null) {
                System.out.println(cssLineOfCode);
            }

        } catch (IOException error) {
            error.printStackTrace();
        } finally {
            try {
                if (bufferRead != null)
                    bufferRead.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }
}
