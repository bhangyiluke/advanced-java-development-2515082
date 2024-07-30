package _07_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExercise {

    public static void main(String[] args) {
        // Create a new empty file called example.txt inside folderA
        try {
           Path dirA= Files.createDirectories(Path.of("src/main/java/_07_05/folderA"));
           Path dirB= Files.createDirectories(Path.of("src/main/java/_07_05/folderB"));
            if(Files.notExists(Paths.get("src/main/java/_07_05/folderA/example.txt"))){
                Files.createFile(Paths.get("src/main/java/_07_05/folderA/example.txt"));
            }
                
            // Copy the file to folderB
            Files.copy(file, Paths.get("src/main/java/_07_05/folderB/example.txt"));
            // List the contents of folderB to check that your file is in there
            Files.list(dirB).forEach(System.out::print);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
