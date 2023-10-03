package BITPracties;

public class FindIthBit {
    public static int toFindIthBit(int givenNumber, int position){

        if((givenNumber & (1<<(position-1))) > 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static int[] returnArray(){
        int[] result = new int[2];
        result[0] = 1;
        result[1] = 2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("result : " + toFindIthBit(9, 3));
    }
}
