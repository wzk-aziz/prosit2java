
/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

public class Zoo {
    String name;
    String city;
    final int NBR_CAGES=25;
    Animal[] animals;
    int nbrAnimals;

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

    void displayZoo() {
        System.out.println("Zoo: " + name + ", " + city + ", " + NBR_CAGES);
    }

    boolean addAnimal(Animal animal){
        if(nbrAnimals < NBR_CAGES && searchAnimal(animal) == -1){// Instruction 12
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }
    boolean removeAnimal(Animal animal){
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
    void displayAnimals(){
        for(int i = 0; i < nbrAnimals; i++){
            System.out.println(animals[i]);
        }
    }

    // Instruction 11
    int searchAnimal(Animal animal){
        for(int i = 0; i < nbrAnimals; i++){
            if(animals[i].equals(animal)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", NBR_CAGES=" + NBR_CAGES +
                '}';
    }
}
