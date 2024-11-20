/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOne;

/**
 *
 * @author DhM
 */
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animals> ZooAnimals = new ArrayList<>();
    
    public void addAnimal(Animals n)
    {
        ZooAnimals.add(n);
    }
    
    public int numOfAnimals()
    {
        return ZooAnimals.size();
    }
    
    public int totalFoodNeeded(String foodName)
    {
        int foodNum = 0;
        for(Animals i:ZooAnimals)
        {
            if(i.getfavFood().equals(foodName))
            {
                foodNum++;
            }
        }
        if(foodName.equals("leaves")) return foodNum*300;
        else if(foodName.equals("meat")) return foodNum*200;
        else if(foodName.equals("fish")) return foodNum*15;
        else return 0;
    }
    
    public double totalSqMetersNeeded(String Area)
    {
        int penguin = 0, tiger = 0, giraffe = 0;
        for(Animals i:ZooAnimals)
        {
            if(i.getfavFood().equals("fish"))
            {
                penguin++;
            }
            else if(i.getfavFood().equals("meat"))
            {
                tiger++;
            }
            else if(i.getfavFood().equals("leaves"))
            {
                giraffe++;
            }
        }
        if(Area.equals("grassland")) return tiger*1000+giraffe*1500;
        else if(Area.equals("water")) return penguin*20;
        else return 0;
    }
    
    public String toString() 
    {
        String Return = "Zoo Animals:\n------------------\n";
        for(Animals i:ZooAnimals)
        {
        Return = Return + "This animal is named " + i.getName() + 
                "\nThey weigh " + i.getWeight() + 
                " kilogram.\nTheir favourite food is " + i.getfavFood() + 
                " \nThey eat " + i.getFoodInADay() + " units of food" +
                "\nTheir natural habitat is " + i.getEnvironment() +
                "\nThe total environment area their habitat occupies is " +
                i.getEnvArea() + " m^2\n------------------\n"; 
        }
        return Return;
    }
}
