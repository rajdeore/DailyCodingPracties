package StringPracties;

public class NumberofLaserBeamsInBank2125 {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int result = 0;

        for (String s : bank){
            int current = 0;

            for(char c : s.toCharArray()){
                if (c == '1'){
                    current += 1;

                }
            }

            if (current > 0 ){
                result += current * prev;
                prev =current;
            }
        }

        return  result;
    }
    public static void main(String[] args) {

    }
}
