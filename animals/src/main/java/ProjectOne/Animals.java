/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOne;

/**
 *
 * @author DhM
 */
public class Animals 
{
    private String Name;
    private double Weight;
    private String favFood;
    private int FoodInADay;
    private String Environment;
    private double EnvArea;
    
    public Animals (String N, double W, String fF, int FD, String Env, double EnvA)
    {
        this.Name = N;
        this.Weight = W;
        this.favFood = fF;
        this.FoodInADay = FD;
        this.Environment = Env;
        this.EnvArea = EnvA;
    }
    
    public String getName()
    {
        return this.Name;
    }
    
    public double getWeight()
    {
        return this.Weight;
    }
    
    public String getfavFood()
    {
        return this.favFood;
    }
    
    public double getFoodInADay()
    {
        return this.FoodInADay;
    }
    
    public String getEnvironment()
    {
        return this.Environment;
    }
    
    public double getEnvArea()
    {
        return this.EnvArea;
    }
    
    public String toString() 
    {
        return "This animal is named " + this.getName() + 
                "\nThey weigh " + this.getWeight() + 
                " kilogram.\nTheir favourite food is " + this.getfavFood() + 
                " \nThey eat " + this.getFoodInADay() + " kilos of food" +
                "\nTheir natural habitat is " + this.getEnvironment() +
                "\nThe total environment area their habitat occupies is " +
                this.getEnvArea() + "\n"; 
    }
    
}
