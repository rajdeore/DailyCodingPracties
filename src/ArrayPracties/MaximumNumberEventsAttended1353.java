package ArrayPracties;

public class MaximumNumberEventsAttended1353 {

    public static int maxEvents(int[][] events) {
        int i=1, count = 1;
        int ln = events.length;
        while(i < ln){

            if(events[i-1][1] >= events[i][0]){
                //merge according to conditon
                //for cur event is totoally inside pre event
                //(1,5)(2,4) --> (1,5)
                if(events[i-1][0] <= events[i][0] && events[i-1][1] >= events[i][1]  ){
                    events[i][0] = events[i-1][0];
                    events[i][1] = events[i-1][1];
                    // System.out.println(Arrays.toString(events));
                    count++;

                }

                // prv is totally inside cur
                // (3,4)(1.7) --> (1,7)
                else if(events[i-1][0] >= events[i][0] && events[i-1][1] <= events[i][1] )
                {
                    // System.out.println(Arrays.toString(events));
                }
                //(1,2)(2,3) --> (1,3)  or (1,3)(2,5) --> (1,5)
                else{
                    events[i][0] = events[i-1][0];
                    count++;
                    // System.out.println(Arrays.toString(events));
                }

            }else{
                count +=1;
            }
            i++;
        }

        return count;
    }


    public static void main(String[] args) {
        int[][] given = {{1,2}, {2,3}, {3,4}};
        int result = maxEvents(given);

        System.out.println(result);
    }
}
