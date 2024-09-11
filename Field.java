/**
 * This class represents The Field player plays in.
 * It contains the coordinates of the field
 *
 * @author Patric Manoharan - B00925625
 */
public class Field {
    //Creating instance variables xpos, ypos, length and width
    private double xpos;
    private double ypos;
    private double length;
    private double width;

    //Constructor for Field
    public Field(double xpos, double ypos, double length, double width){
        this.xpos = xpos;
        this.ypos = ypos;
        this.length = length;
        this.width = width;
    }

    //Getters and Setters
    public double getXpos() {
        return xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setXpos(double xpos) {
        this.xpos = xpos;
    }

    public void setYpos(double ypos) {
        this.ypos = ypos;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //toString method to display the values of the instance variables
    public String toString(){
        return "Field: [" +xpos+","+ypos+"]"+length+","+width;
    }
}
