package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            File file = new File("c:/project/test.txt");
            File result = new File("c:/project/testresult.txt");
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(result);
            BufferedReader reader = new BufferedReader(fr);
            BufferedWriter writer = new BufferedWriter(fw);
            String line = reader.readLine();
            Integer attrnum = 0;
            Integer contentnum = 3;
            Integer number = 0;
            while (line != null) {
                System.out.println(line);
                writer.write(String.format("[{\"components\":" +
                        "[" +
                        "{\"html\":\"<p style=\\\"text-align:center;\\\">%d</p>\"," +
                        "\"label\":\"Контент\"," +
                        "\"refreshOnChange\":false," +
                        "\"key\":\"content%d\"," +
                        "\"type\":\"content\"," +
                        "\"input\":false," +
                        "\"tableView\":false}]}," +
                        "{\"components\":" +
                        "[" +
                        "{\"html\":\"<p style=\\\"text-align:center;\\\">%s</p>\"," +
                        "\"label\":\"Контент\"," +
                        "\"refreshOnChange\":false," +
                        "\"key\":\"content%d\"," +
                        "\"type\":\"content\"," +
                        "\"input\":false," +
                        "\"tableView\":false}]}," +
                        "{\"components\":" +
                        "[" +
                        "{\"label\":\"attr%d\"," +
                        "\"hideLabel\":true," +
                        "\"tableView\":true," +
                        "\"key\":\"attr%d\"," +
                        "\"type\":\"textfield\"," +
                        "\"input\":true}]}],", ++number, ++contentnum, line, ++contentnum, ++attrnum, attrnum));
                writer.newLine();
                line = reader.readLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
