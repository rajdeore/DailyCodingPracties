package JavaConceptPracties.StreamPracties.RendomQuestion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Transaction {
    private int amount;
    private int transactionId;

    public Transaction(int amount, int transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", transactionId=" + transactionId +
                '}';
    }
}

public class Set2Date1312 {
    public static void main(String[] args) {

        //1 Given a string, find the first non-repeated character in it using Stream function
        String input = "raajkkur";
/*        Map<Character, Integer> record = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            //record.computeIfAbsent(ch, k -> 1);

            if(record.containsKey(ch)){
                record.put(ch, record.get(ch) + 1);
            }else{
                record.put(ch, 1);
            }
        }
        for (Character ch  : record.keySet()
             ) {
            if(record.get(ch) == 1){
                System.out.println(ch);
                break;
            }
        }*/
        input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);

        //2 Given a list of integers, find:
        //a. the min number, b max number c sum of aal number d. average of the number, e. the count of number

        List<Integer> inputList = Arrays.asList(6, 4, 1, 7, 3);

        //my: print on by one.
        //inputList.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);

        //optimal
        IntSummaryStatistics intSummaryStatistics = inputList.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Max : " + intSummaryStatistics.getMax());
        System.out.println("Min : " + intSummaryStatistics.getMin());
        System.out.println("Avg : " + intSummaryStatistics.getAverage());
        System.out.println("Sum : " + intSummaryStatistics.getSum());
        System.out.println("Count : " + intSummaryStatistics.getCount());

        //3 find the word 3rd last length
        List<String> words = Arrays.asList("Apple", "banana", "kiwi", "cherry", "mango");

        words.stream()
                .sorted((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                .skip(2)
                .findFirst().ifPresent(System.out::println);


        //4 Given a list of transaction, find the sum of transaction amount for each day using java stream
        Transaction t1 = new Transaction(100, 1);
        Transaction t2 = new Transaction(102, 2);
        Transaction t3 = new Transaction(103, 3);

        List<Transaction> transactionsList = new ArrayList<>();
        transactionsList.add(t1);
        transactionsList.add(t2);
        transactionsList.add(t3);

        int sumOfAmount = transactionsList.stream()
                .mapToInt(Transaction::getAmount)
                .sum();

        System.out.println("sumOfAmount : " + sumOfAmount);


        //5 Given an integer array, return true if array contains duplicate element,return false otherwise
        int[] arrInput = {2, 4, 1, 1, 6, 7};

        Set<Integer> numSet = new HashSet<>();
        System.out.println(Arrays.stream(arrInput)
                .anyMatch(ele -> !numSet.add(ele)));

        System.out.println(Arrays.stream(arrInput).boxed().distinct().count() != arrInput.length);


    }
}
