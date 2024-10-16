/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pethealth;

import core.person.Doctor;
import core.pet.Pet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Eracosta
 */
public class Treatment implements TreatmentType {
    
    private static int id = 0;
    private TreatmentType type;
    private LocalDate date;
    private float cost;
    private Pet pet;
    private ArrayList<Doctor> doctors;

    public Treatment( TreatmentType type, LocalDate date, float cost, Pet pet, ArrayList<Doctor> doctors) {
        this.id = Treatment.id;
        this.type = type;
        this.date = date;
        this.cost = cost;
        this.pet = pet;
        this.doctors = doctors;
        Treatment.id++;
    }

    Treatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TreatmentType getType() {
        return type;
    }

    public void setType(TreatmentType type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
int vaccination;
    @Override
    public void VACCINATION() {
        vaccination++;
        
    }
int deworming = 0;
    @Override
    public void DEWORMING() {
         deworming++;
    }
int surgery = 0;
    @Override
    public void SURGERY() {
        surgery++;
    }

    int checkup = 0;
    @Override
    public void GENERAL_CHECKUP() {
        checkup++;
    }

    void setDoctor(ArrayList<Doctor> doctors) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setLocalDate(LocalDate LocalDate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPet(Pet pet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
