package _06_02.before;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter your occupation: ");
        String occupation = scanner.nextLine();
        System.out.print(String.format("{ Name:%s, Age:%d, Occupation:%s }",name,age,occupation));
    }

}
