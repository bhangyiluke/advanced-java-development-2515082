package _05_02.before;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample(),"Thread One");
        Thread thread2 = new ThreadExample();
        thread2.setName("Thread Two");
        
        thread2.run();
        thread1.run();
    }

}
