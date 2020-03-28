package com.company;

/*

1902 Adapter
Use the AdapterFileOutputStream class to adapt FileOutputStream to the new AmigoStringWriter interface.

Requirements:
1. AmigoStringWriter must be an interface.
2. The AdapterFileOutputStream class must implement the AmigoStringWriter interface.
3. The AdapterFileOutputStream class must contain a private fileOutputStream field of type FileOutputStream.
4. The AdapterFileOutputStream class must contain a constructor with the FileOutputStream parameter.
5. The flush () method of the AdapterFileOutputStream class must delegate authority to the same fileOutputStream method.
6. The writeString (String s) method of the AdapterFileOutputStream class must delegate authority to the same fileOutputStream method.
7. The close () method of the AdapterFileOutputStream class must delegate authority to the same fileOutputStream method.

 */

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Принято
public class AdapterFileOutputStream implements AdapterFileOutputStream {
    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream f) {
        this.fileOutputStream = f;
    }

    public static void main(String[] args) {
    }

    @Override
    public void flush() throws IOException {
        this.fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        this.fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        this.fileOutputStream.close();

    }

    public interface AmigoStringWriter {
        void flush() throws IOException;
        void writeString(String s) throws IOException;
        void close() throws IOException;
    }


}




