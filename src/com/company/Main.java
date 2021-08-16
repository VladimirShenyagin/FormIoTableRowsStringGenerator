package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
//Программа для генерации специфичного для Formio JSON
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
            int attrnum = 0;
            int contentnum = 3;
            int number = 0;
            while (line != null) {
                System.out.println(line);
                if (line.charAt(0) == 'S') {
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
                            "\"input\":true}]}],", ++number, ++contentnum, line.substring(1), ++contentnum, ++attrnum, attrnum));
                    writer.newLine();
                    line = reader.readLine();
                    System.out.println("Строка");
                }
                else if (line.charAt(0) == 'N') {
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
                            "\"mask\": false," +
                            "\"spellcheck\": true," +
                            "\"tableView\":true," +
                            "\"delimiter\": false," +
                            "\"requireDecimal\": false," +
                            "\"inputFormat\": \"plain\"," +
                            "\"key\":\"attr%d\"," +
                            "\"type\":\"number\"," +
                            "\"input\":true}]}],", ++number, ++contentnum, line.substring(1), ++contentnum, ++attrnum, attrnum));
                    writer.newLine();
                    line = reader.readLine();
                    System.out.println("Число");
                }
                else if (line.charAt(0) == 'D') {
                    ++contentnum;
                    ++contentnum;
                    ++attrnum;
                    line = reader.readLine();
                    System.out.println("Не выводить");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
