package JavaConceptPracties.rough;

public class StaticMethodDemo {
    static void displayMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Calling the static method without creating an instance of the class
        //displayMessage();
        StaticMethodDemo staticMethodDemo = null;
        staticMethodDemo.displayMessage();
    }
}
