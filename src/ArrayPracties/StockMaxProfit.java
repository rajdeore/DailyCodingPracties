package ArrayPracties;

public class StockMaxProfit {

    public int findMaxProfitUsingBrute(int [] givenStockArr)
    {
        int maxProfit = 0;
        int ArrLen = givenStockArr.length;
        for(int i=0; i<ArrLen; i++){
            for(int j=i+1; j<ArrLen-1; j++){
                if (givenStockArr[j] - givenStockArr[i] > maxProfit){
                    maxProfit = givenStockArr[j] - givenStockArr[i];
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] StockArr = {7, 1, 5, 3, 6, 4};
        StockMaxProfit stockMaxProfit = new StockMaxProfit();
        int ProfitOfTheDay = stockMaxProfit.findMaxProfitUsingBrute(StockArr);
        System.out.println("resutl : " + ProfitOfTheDay);
    }
}
