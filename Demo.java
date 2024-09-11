/**
 * This class is the main class which uses all the classes to run the code
 * It contains the objects of all the classes
 *It also checks if the ball is reflected or not and prints it.
 *
 * @author Patric Manoharan - B00925625
 */


import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        // Creating EPSILON for comparing doubles
        double EPSILON = Math.pow(10, -8);
        //Creating Random object r
        Random r = new Random();
        // Creating objects for Field, Ball and Player
        Field field = new Field(100.0, 200.0, 750.0, 500.0);
        Ball ball = new Ball(150.0, 300.0);
        Player Pat = new Player("Pat");
        Player Rick = new Player("Rick");

        System.out.println("SOCCER GAME SETUP!");
        System.out.println(Pat + "\n" + Rick + "\n" + field + "\n" + ball);

        //for loop to make players kick the ball 10 times
        for (int i = 0; i < 10; i++) {
            //Generate random numbers between 0.0 and 1.0 and multiplying it with the bounds. It will always be less than or equal to the bounds.
            double distance = r.nextDouble() * 600;
            double direction = r.nextDouble() * 360;

            //Getting the ball coordinates before the kick
            double bx = ball.getBx();
            double by = ball.getBy();

            System.out.println("\n");
            Pat.kick(field, ball, distance, direction);

            //Getting the ball coordinates after the kick
            double nx = ball.getBx();
            double ny = ball.getBy();

            System.out.println(Pat + " kicks the ball for a distance of " + distance + " pixels at " + direction + " degrees");
            System.out.println(ball);

            //Checks if the ball was reflected or not by taking the absolute difference of the old and new coordinates and checking if it's greater than the EPSILON value
            if (Math.abs(bx - nx) < EPSILON || Math.abs(by - ny) < EPSILON){
                System.out.println("The ball was reflected");
            }
            /* cited code ends */
            distance = r.nextDouble() * 600;
            direction = r.nextDouble() * 360;

            bx = ball.getBx();
            by = ball.getBy();

            System.out.println("\n");
            Rick.kick(field, ball, distance, direction);

            nx = ball.getBx();
            ny = ball.getBy();

            System.out.println(Rick + " kicks the ball for a distance of " + distance + " pixels at " + direction + " degrees");
            System.out.println(ball);

            if (Math.abs(bx - nx) < EPSILON || Math.abs(by - ny) < EPSILON){
                System.out.println("The ball was reflected");
            }
        }
    }
}