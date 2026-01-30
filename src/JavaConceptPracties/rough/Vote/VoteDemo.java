package JavaConceptPracties.rough.Vote;

public class VoteDemo {
    public static void main(String[] args) {
        int age = 24;
        try {
            if (age < 18) {
                throw new ToYoungException();
            } else if (age > 60) {
                throw new ToOldException("You are old to vote");
            } else {
                System.out.println("your vote is valuable to country");
            }
        } catch (ToYoungException e) {
            System.out.println("Sorry you are to young !!! ");
        } catch (ToOldException toOldException) {
            System.out.println("Sorry you are to old !!!");
        } finally {
            System.out.println("Thank you for coming to voting poll");
        }


    }
}
