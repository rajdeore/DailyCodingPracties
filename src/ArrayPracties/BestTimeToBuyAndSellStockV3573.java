package ArrayPracties;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BestTimeToBuyAndSellStockV3573 {

    public static void main(String[] args) {
        int[] stockPrice = {12,16,19,19,8,1,19,13,9};
        int k = 3;

        long result = maximumProfit(stockPrice, k);
    }

    private static long maximumProfit(int[] stockPrice, int k) {
        long result = 0;
        Set<Integer> profitRecord = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < stockPrice.length-1; i++) {
            if(stockPrice[i] >= stockPrice[i+1]){
                Integer profit = stockPrice[i] - stockPrice[i+1];
                profitRecord.add(profit);
            }else{
                Integer profit = stockPrice[i+1] - stockPrice[i];
                profitRecord.add(profit);
            }

        }

        //profitRecord.stream().forEach(ele -> System.out.print(ele + " "));
        result  = profitRecord.stream().limit(k).mapToInt(ele -> ele).sum();
        //System.out.println(result);


        return result;
    }
}
