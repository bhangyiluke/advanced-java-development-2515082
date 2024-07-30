package _06_05;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExercise {
    final String fileName="src/main/java/_06_05/BufferedReaderVsScanner.txt";
   
    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = "";
        try( BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            firstLine = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        String wholeFile = "";
        StringBuilder buf = new StringBuilder();
        try ( BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            reader.lines().forEach(w->buf.append(w+" "));
            wholeFile = buf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wholeFile;
    }

}
