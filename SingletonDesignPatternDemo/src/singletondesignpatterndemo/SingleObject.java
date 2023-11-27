/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletondesignpatterndemo;

/**
 *
 * @author danielike
 * @version 1.0 (27/11/23)
 */
public class SingleObject {
    
    // creating an object of the SingleObject
    private static SingleObject instance = new SingleObject();
    
    /** The constructor is private so that it cannot be instantiated outside this class.
     * Currently the constructor does not need to perform any actions.
     * @author danielike
     * @version 1.0 (27/11/23)
     */
    private SingleObject(){}
    
    /**
     * This is the method through which we get access to the Singleton Object
     * @author danielike
     * @version 1.0 (27/11/23)
     * @return A singleton object
     */
    public static SingleObject getInstance(){
        return instance;
    }
    
    /**
     * This is a method in which we can write our logic - in this case printing Hello World from the Singleton Class.
     * @author danielike
     * @version 1.0 (27/11/23)
     * @return String
     */
    public String showMessage(){
        System.out.println("Hello world!");
        return "Hello world!";
    }
}
