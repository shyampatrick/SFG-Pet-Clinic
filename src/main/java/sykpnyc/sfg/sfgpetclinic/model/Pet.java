package sykpnyc.sfg.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Vet
 */
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public Pet() {
    }

    public Pet(PetType petType, Owner owner, LocalDate birthDate) {
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return this.petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Pet petType(PetType petType) {
        this.petType = petType;
        return this;
    }

    public Pet owner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public Pet birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pet)) {
            return false;
        }
        Pet pet = (Pet) o;
        return Objects.equals(petType, pet.petType) && Objects.equals(owner, pet.owner)
                && Objects.equals(birthDate, pet.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petType, owner, birthDate);
    }

    @Override
    public String toString() {
        return "{" + " petType='" + getPetType() + "'" + ", owner='" + getOwner() + "'" + ", birthDate='"
                + getBirthDate() + "'" + "}";
    }

}