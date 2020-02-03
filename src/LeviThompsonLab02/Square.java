/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab02;

/**
 *
 * @author levi.thompson
 */
public class Square extends Rectangle {

    /*attribute of square, not entirely necessary since rectangles
    attributes are inherited into square*/
    private double side = 1;
    private Measurement s;
    
    //constructor that prints the sides of the square
    public Square(double side, String u) {
        //uses the parent constructor to "get" sides
        super(side, side, u);        
        this.side = side;
        //new measure to be put within the print, "s" meaning side
        s = new Measurement((int)side, u);
        System.out.println("New Square: " + s);
    }

    @Override
    public String toString() {
        return "Square of " + s.toString();
    }

    
    
}
