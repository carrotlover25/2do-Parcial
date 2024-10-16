/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pet;

import core.person.Owner;
import core.pethealth.Treatment;
import java.util.ArrayList;

/**
 *
 * @author Eracosta
 */
public class Dog extends Pet {
    private String breed;

    
    public Dog(String breed, String name, int age, float height, float weight, Owner owner) {
        super(name, age, height, weight, owner);
        this.breed = breed;
    }
    
    
}
