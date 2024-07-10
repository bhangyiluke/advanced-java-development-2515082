package _04_01.before;

public class Main {
    public static void main(String[] args){
        Greeting hello = () -> System.out.println("Hello World");;
        hello.printMessage();
        Greeting morning = () -> System.out.println("Good Morning");
        morning.printMessage();
        Greeting afterNoon = () -> System.out.println("Good afternoon!");
        afterNoon.printMessage();
    }
}
