package JavaConceptPracties.StreamPracties.TerminalOperation;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ForEachPractice {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        //Print fruits
        //using stream forEach()
        fruits.stream().forEach(System.out::println);


        //replace name with length of name-string
        //Not Possible : it is terminal operation. it will not return any thing
        //System.out.println(fruits.stream().forEach(String::length));


        // use case: when you want to do some operation on every element. like sending email to every one

        //register the fruit to the file

       fruits.stream().forEach(ForEachPractice::register);

        fileReader();

    }

    private static void register(String fr) {
        String filePath = "src/JavaConceptPracties/StreamPracties/TerminalOperation/Temp.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){

            writer.write(fr);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader(){
        String filePath = "src/JavaConceptPracties/StreamPracties/TerminalOperation/Temp.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
