package JavaConceptPracties.ExceptionDemo;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class IOExReadFile {

    /*public static int readThreeLine() throws IOException {
        FileReader file = new FileReader("C:\\\\Users\\\\RDEORE\\\\Raj\\\\java\\\\DailyCodingPracties\\\\src\\\\Resource\\\\test.txt");
        BufferedReader fileInput = new BufferedReader(file);
        for(int i=0; i<3; i++){
            System.out.println(fileInput.readLine());
        }
        return 10;
    }*/

    public static void startLocationService()
            throws ServletException {
        // Make it available in the JNDI tree. Since it is a HashMap the
        // LocationService can be looked up as a map from anywhere.
        try {
            System.out.println("Hi raj");
            throw new RuntimeException();
        } catch (Exception e) {
            throw new ServletException(
                    "Could not bind LocationService provider to JNDI tree", e);
        }
    }

    public static int readThreeLine() throws IOException {
        FileReader file = null;
        try {
            file = new FileReader("C:\\\\Users\\\\RDEORE\\\\Raj\\\\java\\\\DailyCodingPracties\\\\src\\\\Resource\\\\test.txt");
            BufferedReader fileInput = new BufferedReader(file);
            for (int i = 0; i < 3; i++) {
                System.out.println(fileInput.readLine());
            }
        } catch (IOException e) {
            throw new IOException(e);
        }

        return 10;
    }

    public static void main(String[] args) throws ServletException {
        startLocationService();
        // System.out.println(readThreeLine());

/*        try {
            startLocationService();
        } catch (ServletException e) {
            throw new RuntimeException("Raj : Main class catch " + e);
        }*/
    }
}
