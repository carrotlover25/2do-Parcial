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
public abstract class Pet {
    protected String name;
    protected int age;
    protected float height;
    protected float weight;
    protected Owner owner;
    protected ArrayList<Treatment> treatments;  
    
        
    

         public Pet(String name, int age, float height, float weight, Owner owner) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.owner = owner;
        this.treatments = new ArrayList<>();
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }

    
    
    
}
