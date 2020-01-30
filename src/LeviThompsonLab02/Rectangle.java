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

    public double getWidth() {
        double rwidth = this.width;
        
        return rwidth;
    }
    
    public double getHeight() {
        double rheight = this.height;
        
        return rheight;
    }
    
    public Rectangle(double width, double height) {

        System.out.println("New Rectangle: " + width + " by " + height);

    }

    public double getArea() {
        double area = height * width;

        return area;
    }

    public double getPerimeter() {

        return 0.0;
    }
}
