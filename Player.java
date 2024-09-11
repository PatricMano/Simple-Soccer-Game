/**
 * This class represents The Player who kicks the ball.
 * It contains the name of the player and the kick method.
 *
 * @author Patric Manoharan - B00925625
 */

public class Player {

    //Creating instance variable name
    private String name;

    //Constructor for Player
    public Player(String name){

        this.name = name;
    }
    //toString method to display player name
    public String toString(){
        return "Player " + name;
    }
    //kick method which allows player to kick the ball and reflect the ball to different positions
    public void kick(Field f, Ball b, double d, double r){
         double r_radians = Math.toRadians(r);
         double nx = b.getBx() + d * Math.cos(r_radians);
         double ny = b.getBy() + d * Math.sin(r_radians);

         if (nx < f.getXpos() || nx > f.getXpos()+ f.getWidth()){
             b.setBy(ny);
         } else if (ny < f.getYpos() || ny > f.getYpos()+ f.getWidth()) {
             b.setBx(nx);
         } else {
             b.setBx(nx);
             b.setBy(ny);
         }
    }
}
