/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pethealth;

import core.person.Doctor;
import core.person.Owner;
import core.pet.Pet;
import java.time.LocalDate;
import java.util.ArrayList;
import core.pethealth.Treatment;

/**
 *
 * @author Eracosta
 */
public class PetHealth   {
    private ArrayList<Doctor> doctors;
    private ArrayList<Owner> owners;
    private ArrayList<Pet> pets;
    private ArrayList<Treatment> treatments;

    public PetHealth(ArrayList<Doctor> doctors, ArrayList<Owner> owners, ArrayList<Pet> pets, ArrayList<Treatment> treatments) {
        this.doctors = doctors;
        this.owners = owners;
        this.pets = pets;
        this.treatments = treatments;
    }
   
    public boolean addOwner(Owner owner){
        if(!this.owners.contains(owner)){
            this.owners.add(owner);
            return true;
        }
        return false;
    }
    public boolean addDoctor (Doctor doctor){
        if(!this.doctors.contains(doctor)){
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }
    public boolean addPet (Pet pet){
        if(!this.pets.contains(pet)){
            this.pets.add(pet);
            return true;
        }
        return false;
    }
    
    public Doctor getDoctor(int index){
        return this.doctors.get(index);
    }
    
    public Pet getPet(int index){
        return this.pets.get(index);
    }
    
    public void createTreatment(Pet pet, ArrayList<Doctor> doctors, TreatmentType type, LocalDate LocalDate, float cost){
        Treatment treatment = new Treatment();
        treatment.setPet(pet);
        treatment.setDoctor(doctors);
        treatment.setType(type);
        treatment.setLocalDate(LocalDate);
        treatment.setCost(cost);
    }
    
    public void doctorSummary(){
        System.out.println("DoctorSummary");
        for ( Owner owner : this.owners){
        System.out.println("Id: " + owner.getId() + "Name: " + Owner.class.getName());
        int index = 1;
        System.out.println("Attendance");
        for (Pet pet : owner.getPets()){
            System.out.println("Dogs: " );
            System.out.println("Cats: " );
            System.out.println("Parrots: "  );
            
        }
    }
    }
    public Owner ownerMostSpent(){
        Owner maxSpentO = null;
        double maxSpent = 0;
  
        
    } return maxSpent;
        
    }

    /*@Override
    public void VACCINATION() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void DEWORMING() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void SURGERY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void GENERAL_CHECKUP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
