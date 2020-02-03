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

    public Measurement getPerimeter(double vertical,
            double horizontal, String u) {
        this.vertical = vertical;
        this.horizontal = horizontal;

        //grouping of code to find the calculations of perimeter of ellipse
        double pi = Math.PI;
        double firstHalfOfP = 3 * (vertical + horizontal);
        double lastHalfOfP = ((3 * vertical)
                + horizontal) * (vertical + (3 * horizontal));
        double root = Math.sqrt(lastHalfOfP);
        double perimeter = Math.PI * (firstHalfOfP - root);

        //new measurement that is perimeter combined with the unit
        p = new Measurement((int) perimeter, u);

        return p;
    }

    public Measurement getArea(double vertical,
            double horizontal, String u) {
        this.vertical = vertical;
        this.horizontal = horizontal;

        //finding the calculations of area of ellipse
        double area = Math.PI * vertical * horizontal;

        //new measurement that is area combined with the unit
        a = new Measurement((int) area, u);

        return a;
    }
}
