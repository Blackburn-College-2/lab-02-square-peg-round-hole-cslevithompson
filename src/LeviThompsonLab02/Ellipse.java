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
public class Ellipse {

    private double vertical;
    private double horizontal;

    //"p" meaning perimeter
    private Measurement p;
    //"a" meaning area
    private Measurement a;

    /* constructor setting a default size for the ellipse if no args are 
    entered */
    public Ellipse() {
        this.vertical = 1;
        this.horizontal = 1;
    }
    
    //constructor that prints the size of the Ellipse
    public Ellipse(double vertical, double horizontal) {
        /*assigns vertical and horizontal with the numbers given from the 
        arguments */
        this.vertical = vertical;
        this.horizontal = horizontal;

        System.out.println("New Ellipse: " + vertical + " by " + horizontal);
    }

    //method that gets the perimeter of an ellipse
    public Measurement getPerimeter(double vertical,
            double horizontal, String u) {    
        /*assigns vertical and horizontal with the numbers given from the 
        arguments */
        this.vertical = vertical;
        this.horizontal = horizontal;

        /*grouping of code to find the calculations of perimeter of ellipse;
        starting on line 48 and goes to line 61 */
        
        //variable that stores pi 
        double pi = Math.PI;
        /* variable that stores the math for the first side of the perimeter
        equation */
        double firstHalfOfP = 3 * (vertical + horizontal);
        /* variable that stores the math for the last half of the perimeter
        equation */
        double lastHalfOfP = ((3 * vertical)
                + horizontal) * (vertical + (3 * horizontal));
        /* variable that stores the square root of the last half of the 
        perimeter equation */
        double root = Math.sqrt(lastHalfOfP);
        /* variable that finishes up the math for the perimeter equation and
        stores it */
        double perimeter = Math.PI * (firstHalfOfP - root);

        //new measurement that is perimeter combined with the unit
        p = new Measurement((int) perimeter, u);

        return p;
    }
    
    //method that gets the area of an ellipse
    public Measurement getArea(double vertical,
            double horizontal, String u) {
        /*assigns vertical and horizontal with the numbers given from the 
        arguments */
        this.vertical = vertical;
        this.horizontal = horizontal;

        //calculations to find the area of ellipse
        double area = Math.PI * vertical * horizontal;

        //new measurement that is area combined with the unit
        a = new Measurement((int) area, u);

        return a;
    }
}
