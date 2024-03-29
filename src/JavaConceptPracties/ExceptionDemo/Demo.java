package JavaConceptPracties.ExceptionDemo;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;

public class Demo {

    @PostConstruct
    public void init() throws ServletException {
        IOExReadFile.startLocationService();
    }

    public static void main(String[] args) throws ServletException {
        Demo demo = new Demo();
        demo.init();
    }
}
