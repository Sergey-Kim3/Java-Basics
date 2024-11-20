/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOne;

/**
 *
 * @author DhM
 */
public class Penguin extends Animals
{
    public Penguin(String N, double W)
    {
        super(N, W, "fish", 15, "water", 20);
    }
    
    public String toString() 
    {
        return "This animal is named " + this.getName() + 
                "\nThey weigh " + this.getWeight() + 
                " kilogram.\nTheir favourite food is " + this.getfavFood() + 
                " \nThey eat " + this.getFoodInADay() + " units of " + this.getfavFood() + " a day" +
                "\nTheir habitat needs to contain " + this.getEnvironment() +
                "\nThe total environment area their habitat should occupy is " +
                this.getEnvArea() + " m^2\n------------------"; 
    }
}
