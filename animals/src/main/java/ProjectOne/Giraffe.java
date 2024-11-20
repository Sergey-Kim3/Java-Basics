/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOne;

/**
 *
 * @author DhM
 */
public class Giraffe extends Animals 
{
    public Giraffe(String N, double W)
    {
        super(N, W, "leaves", 300, "grassland", 1500);
    }
    
    public String toString() 
    {
        return "This animal is named " + this.getName() + 
                "\nThey weigh " + this.getWeight() + 
                " kilogram.\nTheir favourite food is " + this.getfavFood() + 
                " \nThey eat " + this.getFoodInADay() + " units of " + this.getfavFood() + " a day" +
                "\nTheir habitat needs to be a " + this.getEnvironment() +
                "\nThe total environment area their habitat should occupy is " +
                this.getEnvArea() + " m^2\n------------------"; 
    }
}
