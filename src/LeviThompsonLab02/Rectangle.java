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
public class Rectangle {

    double width = 1;
    double height = 1;

    //constructor that prints the size of the rectangle
    public Rectangle(double width, double height, String u) {
        //assigns height and width with the numbers given from the arguments
        this.width = width;
        this.height = height;
        
        //new measure to be put within the print, "w" meaning width
        Measurement w = new Measurement(width,u);
        //new measure to be put within the print, "h" meaning height
        Measurement h = new Measurement(height,u);

        System.out.println("New Rectangle: " + w + " by " + h);

    }

    //method that returns the width
    public double getWidth() {

        double rWidth = this.width;

        return rWidth;
    }

    //method that returns the height
    public double getHeight() {

        double rHeight = this.height;

        return rHeight;
    }

    //method that does the math to get the area then returns it
    public double getArea() {
        //math to get area of rectangle
        double area = height * width;

        return area;
    }

    //method that does the math to get the perimeter then returns it
    public double getPerimeter() {
        double perimeter = (height * 2) + (width * 2);

        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle of " + width + " by " + height;
    }

}
