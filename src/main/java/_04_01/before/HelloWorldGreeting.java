package _04_01.before;

import _04_02.before.Greeting;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void printMessage() {
        System.out.println("Hello World");
    }
}
