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
public class Cat extends Pet{
    private String breed;

    public Cat(String breed, int age, double par1, double height, Owner owner, String name) {
        super(name, age, height, weight, owner);
        this.breed = breed;
    }
    
    
}
