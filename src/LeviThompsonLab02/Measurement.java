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

public class Measurement {
    double value;
    String unit;
    //method to assign new values to attribute when object is created
    public Measurement(double value, String unit) {
        this.value = value;
        this.unit = unit;
                
    }

    @Override
    public String toString() {
        return value + unit;
    }

}

