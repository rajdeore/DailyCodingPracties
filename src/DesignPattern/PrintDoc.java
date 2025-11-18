package DesignPattern;

public class PrintDoc {
    public static void main(String[] args) {

        //constructor is private --> can not create object with "new" keyword
        //SingletonDemo singletonDemo1 = new SingletonDemo();

        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        SingletonDemo singletonDemo3 = SingletonDemo.getInstance();

        singletonDemo2.print("Doc - 2");
        singletonDemo3.print("Doc - 3");

        // Confirm both are the same instance
        System.out.println(singletonDemo3 == singletonDemo2);
    }
}
