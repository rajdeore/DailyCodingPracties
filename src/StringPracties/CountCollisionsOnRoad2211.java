package StringPracties;

public class CountCollisionsOnRoad2211 {

    public static int countCollisions(String directions) {        int collisions = 0;
        int consecutiveR = 0;

        for (int i = 0; i < directions.length(); i++) {
            char current = directions.charAt(i);

            if (current == 'R') {
                consecutiveR++; // Count consecutive 'R'
            } else if (current == 'L') {
                // Collisions for all consecutive 'R' and the current 'L'
                collisions += consecutiveR + 1;
                consecutiveR = 0; // Reset after collision
            } else if (current == 'S') {
                // Collisions for all consecutive 'R' with stationary 'S'
                collisions += consecutiveR;
                consecutiveR = 0; // Reset after collision
            }
        }

        return collisions;

    }

    public static void main(String[] args) {
        String str = "SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR";
        System.out.println(countCollisions(str)); // Expected output: 20
    }
}