/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.pet.Pet;
import core.pethealth.PetHealth;
import java.util.ArrayList;

/**
 *
 * @author Eracosta
 */
public class Owner extends Person {

    
    
    private PetHealth petHealth;
    private ArrayList<Pet> pets;

    public Owner(PetHealth petHealth, ArrayList<Pet> pets, int id, String name) {
        super(id, name);
        this.petHealth = petHealth;
        this.pets = pets;
    }

    public PetHealth getPetHealth() {
        return petHealth;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Iterable<Pet> getPets() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Iterable<Pet> getPets() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
}
