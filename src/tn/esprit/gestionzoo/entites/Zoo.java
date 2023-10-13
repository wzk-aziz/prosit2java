/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package tn.esprit.gestionzoo.entites;

public class Zoo {
    private String name;
    private String city;
    final int NBR_CAGES=25;
    private Animal[] animals;
    private int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city /*int NBR_CAGES*/) {
        this.name = name;
        this.city = city;
        //this.NBR_CAGES = NBR_CAGES;
        this.animals = new Animal[NBR_CAGES];
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2){
      if (z1.nbrAnimals > z2.nbrAnimals){
          return z1;
      }else if (z2.nbrAnimals > z1.nbrAnimals){
          return z2;
      }else{
          System.out.println("2 zoos are equal");
      return z1;
      }

    }
    boolean isZooFull(){
        return this.nbrAnimals == this.NBR_CAGES;
    }

    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entites.Zoo: " + name + ", " + city + ", " + NBR_CAGES);
    }

  public boolean addAnimal(Animal animal){
        if(isZooFull() && searchAnimal(animal)==-1){
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }//instruction15

  /*  boolean addAnimal(tn.esprit.gestionzoo.entites.Animal animal){
        if(nbrAnimals < NBR_CAGES && searchAnimal(animal) == -1){// Instruction 12
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }*/
    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index != -1){
            for (int i = index; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrAnimals - 1] = null;
            nbrAnimals--;
            return true;
        } else {
            return false;
        }
    }
   public void displayAnimals(){
        for(int i = 0; i < nbrAnimals; i++){
            System.out.println(animals[i]);
        }
    }

    // Instruction 11
   public int searchAnimal(Animal animal){
        for(int i = 0; i < nbrAnimals; i++){
            if(animals[i].equals(animal)){
                return i;
            }
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setName(String name) {
        if(name.isEmpty())
        this.name = name;
        else
            System.out.println("le nom ne doit pas etre vide");
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entites.Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", NBR_CAGES=" + NBR_CAGES +
                '}';
    }



}
