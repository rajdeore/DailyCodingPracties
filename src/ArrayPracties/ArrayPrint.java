package ArrayPracties;
public class ArrayPrint {
    public static void arrayPrint(int[] givenArrray){
        for (int i=0; i<givenArrray.length; i++) {
            if(i != givenArrray.length-1){
                System.out.print(givenArrray[i] + ", ");
            }else{
                System.out.println(givenArrray[i]);
            }
        }
    }
}
