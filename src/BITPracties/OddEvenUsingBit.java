package BITPracties;

import java.util.Objects;
import java.util.Scanner;

public class OddEvenUsingBit {

    public static boolean IsNumberEven(int GivenNumber) {
        return (GivenNumber & 1) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean option;
        do {
            System.out.print("please enter a number : ");
            int number = 0;
            boolean data = scanner.hasNextInt();
            System.out.println("data:"+data);
            while(!data){
                System.out.println("Please enter valid number");
                scanner.nextLine();
                data = scanner.hasNextInt();
            }
            number = scanner.nextInt();

            if (IsNumberEven(number)) {
                System.out.println("number is EVEN");
            } else {
                System.out.println("number is ODD");
            }
            System.out.print("want to test more number [y/n] : ");
            scanner.nextLine();
            String choice = scanner.nextLine();
            System.out.println("choice = " + choice);
            option = (Objects.equals(choice.toUpperCase(), "Y"));
        } while (option);

    }

    private static boolean checkValidNumber(int number) {


        return false;
    }
    }
