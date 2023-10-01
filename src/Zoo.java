
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
    int nbrCages;
    Animal[] animals;
    int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    void displayZoo() {
        System.out.println("Zoo: " + name + ", " + city + ", " + nbrCages);
    }

    boolean addAnimal(Animal animal){
        if(nbrAnimals < nbrCages && searchAnimal(animal) == -1){// Instruction 12
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
                ", nbrCages=" + nbrCages +
                '}';
    }
}
