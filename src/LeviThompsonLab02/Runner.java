/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab02;


/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle(2.5, 5.5, " meter(s)");
        Square s = new Square(3.5, " meter(s)");
        System.out.println(r);
        System.out.println(s);
        Ellipse e = new Ellipse(3.5,4.5);
        Circle c = new Circle(3.5);
    }

    

}


/* Estimated time: 3 hours 
   Time spent: around 5-6 hours */