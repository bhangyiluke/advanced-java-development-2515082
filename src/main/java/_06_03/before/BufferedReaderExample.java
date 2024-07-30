package _06_03.before;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BufferedReaderExample {

    public static void main(String[] args) {
try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_03/example.txt"))) {
    
    //Get the first line
    String firstLine=reader.readLine();
    System.out.println(firstLine);
    //Get the rest of the lines
    StringBuffer lines = new StringBuffer();
    // reader.lines().forEach(l -> lines.append("\n"+l));
    reader.lines().forEach(lines::append);
    System.out.println(lines);
    System.out.println();
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

    }
}