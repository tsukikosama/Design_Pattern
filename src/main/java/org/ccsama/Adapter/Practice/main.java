package org.ccsama.Adapter.Practice;

import java.io.*;
import java.util.Properties;

public class main {
    public static void main(String[] args) throws IOException {
        FileIo f = new FileProperties();
        try {
            f.readFromFile("C:\\Users\\Administrator\\Desktop\\file.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","300");
            f.writeToFile("C:\\Users\\Administrator\\Desktop\\file2.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }
        String year = f.getValue("year");
        System.out.println(year);
    }
}
