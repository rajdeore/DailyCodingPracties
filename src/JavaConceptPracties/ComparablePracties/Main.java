package JavaConceptPracties.ComparablePracties;

import com.sun.deploy.Environment;
import sun.text.normalizer.UTF16;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Main {

    public static  void main(String[] args) {
        String practice = "pujaErande123";
        practice = practice.substring(0, 10);
        System.out.println(":"+practice);
        System.out.println("len:"+practice.length());
        /*context = (CanaryContext)
                getCallState().getContainer().getContextByDeployedName(contextName);

        context = Optional.ofNullable(getCallState())
                .map(CallState::getContainer)
                .map(Container :: getContextByDeployedName(contextName))
                .map(this::convertToCanaryContext)
                .orElse(null);

abc.getCont(abc)*/


        Student stud = new Student(new History(null));
        Syllabase syl = new Syllabase();

        String result =  Optional.ofNullable(stud.getHistory())
                .map(History::getSyllabase)
                .map(Syllabase-> syl.getBook("abc"))
                //.map(this::castToObject)
                .orElse(null);

        System.out.println("result :"+result);

    }

    /*private Object convertToCanaryContext(Object servletContext) {
        return (CanaryContext) servletContext;
    }*/

    private Object castToObject(String bookName) {
        return (Object) bookName;
    }
    }

    class Student{
    private History history;


        public Student(History history) {
            this.history = history;
        }

        public History getHistory() {
            return history;
        }

        public void setHistory(History history) {
            this.history = history;
        }
    }

class History{
    private Syllabase syllabase;

    public History(Syllabase syllabase) {
        this.syllabase = syllabase;
    }

    public Syllabase getSyllabase() {
        return syllabase;
    }

    public void setSyllabase(Syllabase syllabase) {
        this.syllabase = syllabase;
    }


}

class Syllabase{
    private String book;
    private int id;

    public Syllabase(){

    }

    public Syllabase(String book, int id) {
        this.book = book;
        this.id = id;
    }

    public String getBook(String abc) {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
