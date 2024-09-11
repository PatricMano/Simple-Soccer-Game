/**
 * This class represents the ball the player kicks.
 * It contains the position of the ball.
 *
 * @author Patric Manoharan - B00925625
 */

public class Ball {
    //Creating Instance variables bx and by
    private double bx;
    private double by;

    //Constructor for Ball
    public Ball(double bx, double by) {
        this.bx = bx;
        this.by = by;
    }

    //Getters and Setters for bx and by
    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }

    public void setBx(double bx) {
        this.bx = bx;
    }

    public void setBy(double by) {
        this.by = by;
    }

    //toString method to display the ball coordinates
    public String toString(){
        return  "Ball is at (" + bx +","+ by +")";
    }
}
