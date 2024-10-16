/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.pethealth.PetHealth;
import core.pethealth.Treatment;
import java.util.ArrayList;

/**
 *
 * @author Eracosta
 */
public class Doctor extends Person {
    private PetHealth petHealth;
    private ArrayList<Treatment> treatments;

    public Doctor(PetHealth petHealth, ArrayList<Treatment> treatments, int id, String name) {
        super(id, name);
        this.petHealth = petHealth;
        this.treatments = treatments;
    }

    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
