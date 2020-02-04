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
public class Circle extends Ellipse {
    private double radius;
    
    // "p" meaning perimeter
    private Measurement p;
    // "a" meaning area
    private Measurement a;
    
    /* constructor that sets the default size of the Circle if no args are 
    entered */
    public Circle() {
        this.radius = 1;
    }
    
    //constructor that prints the size of the Circle
    public Circle(double radius) {
        this.radius = radius;
        
        System.out.println("New Circle: " + radius);
    }
    
    /* method that gets the perimeter of a circle */
    public Measurement getPerimeter(double radius, String u) {
        //assigns radius with the numbers given from the arguments
        this.radius = radius;
        
        //calculations to find the perimeter of the circle
        double perimeter = 2 * Math.PI * radius;
        
        //new measurement that is perimeter combined with the unit
        p = new Measurement((int)perimeter, u);
        
        return p;
    }
    
    /* method that gets the area of a circle */
    public Measurement getArea(double radius, String u) {
        //assigns radius with the numbers given from the arguments
        this.radius = radius;
        
        //calculations to find the area of the circle
        double area = Math.PI * radius * radius;
        
        //new measurement that is area combined with the unit
        a = new Measurement((int)area, u);
        
        return a;
    }
}
