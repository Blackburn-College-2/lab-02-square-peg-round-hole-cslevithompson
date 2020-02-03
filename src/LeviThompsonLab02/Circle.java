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
    
    public Circle() {
        this.radius = 1;
    }
    
    public Circle(double radius) {
        this.radius = radius;
        
        System.out.println("New Circle: " + radius);
    }
    
    public Measurement getPerimeter(double radius, Measurement m) {
        
        return m;
    }
    
    public Measurement getArea(double radius, Measurement m) {
        
        return m;
    }
}
