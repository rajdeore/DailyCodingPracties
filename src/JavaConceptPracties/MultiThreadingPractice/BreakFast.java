package JavaConceptPracties.MultiThreadingPractice;

class Task extends Thread {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }


    @Override
    public void run() {
        System.out.println(taskName + " starting ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class BreakFast {

    public static void main(String[] args) throws InterruptedException {
        Task tea = new Task("Tea Making Task");
        Task coffee = new Task("Coffee Making Task");


            tea.start();
            coffee.start();

            tea.join();
            coffee.join();

            System.out.println("Breakfast is ready to serve");
    }


}
