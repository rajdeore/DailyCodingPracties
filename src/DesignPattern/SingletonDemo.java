package DesignPattern;

public class SingletonDemo {
    private static SingletonDemo instance;

    private SingletonDemo() {
        System.out.println("PrinterSpooler initialized");
    }

    // only one instance will be created. That will be shared by every one.
    //Step 1: Create a private static instance
    //Step 2: Private constructor to prevent instantiation
    // Step 3: Provide a global access point  :   method --> getInstance => responsible for creating object if not available or Else return the old.

    //look for PrintDoc class for use of this class

    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    //extra
    //In multi-threaded applications, the basic Singleton can cause issues. To make it thread-safe, you can:
    //Use synchronized method.
    //Use eager initialization.
    //Use Bill Pugh Singleton (using inner static class) — recommended
}
