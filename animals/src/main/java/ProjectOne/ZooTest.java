/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOne;

/**
 *
 * @author DhM
 */

public class ZooTest {
    public static void main(String[] args) {
        Zoo Green = new Zoo();
        Giraffe Adams = new Giraffe("Adams", 321);
        Giraffe Benjamin = new Giraffe("Benjamin", 210);
        Penguin Richard = new Penguin("Richard", 89);
        Penguin Chloy = new Penguin("Chloy", 77);
        Tiger Ayster = new Tiger("Ayster", 123);
        Tiger Ricardo = new Tiger("Ricardo", 100);
        
        Green.addAnimal(Adams);
        Green.addAnimal(Benjamin);
        Green.addAnimal(Richard);
        Green.addAnimal(Chloy);
        Green.addAnimal(Ayster);
        Green.addAnimal(Ricardo);
        
        System.out.println(Adams.toString());
        System.out.println(Ricardo.toString());
        System.out.println(Green.toString());
        System.out.println("Total amount of animals in the zoo is " + Green.numOfAnimals());
        System.out.println("Total amount of food needed for tigers is " + Green.totalFoodNeeded("meat"));
        System.out.println("Total square meters needed for grassland living animals is " + Green.totalSqMetersNeeded("grassland"));
    }
}
