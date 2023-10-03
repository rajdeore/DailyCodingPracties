package BITPracties;

public class SetIthBit {



    public static int toSetIthBit(int givenNumber, int position, int bitToSet){
        FindIthBit findIthBit = new FindIthBit();
        int BitOnIthPostion = findIthBit.toFindIthBit(givenNumber, position);

        if(BitOnIthPostion == bitToSet){
            return givenNumber;
        }

        return givenNumber;
    }
}
