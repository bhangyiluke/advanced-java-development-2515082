package _07_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExercise {

    public static void main(String[] args) {
        // Create a new empty file called example.txt inside folderA
        try {
            Path dirA = Files.createDirectories(Paths.get("src/main/java/_07_05/folderA"));
            Path dirB = Files.createDirectories(Paths.get("src/main/java/_07_05/folderB"));
            Path fileA = Paths.get(dirA + "/example.txt");
            Path fileB = Paths.get(dirB + "/example.txt");
            if (Files.notExists(fileA)) {
                fileA = Files.createFile(fileA);
            }

            // Copy the file to folderB
            if (Files.notExists(fileB)) {
                Files.copy(fileA, fileB);
            }
            // List the contents of folderB to check that your file is in there
            Files.list(dirB).forEach(System.out::print);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
