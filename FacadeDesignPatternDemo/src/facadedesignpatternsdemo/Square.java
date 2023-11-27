/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadedesignpatternsdemo;

/**
 * Square is a concrete class which implements the Shape interface.
 * @author danielike
 * @version 1.0
 */
public class Square implements Shape {

    @Override
    public String draw() {
        System.out.println("Square::draw()");
        return "Square::draw()";
    }
    
}
