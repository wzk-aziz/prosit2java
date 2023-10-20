/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.*;

public class Main {
    public static void main(String[] args) {
        Animal lion=new Animal();
       /*
        lion.setfamily="felines";
        lion.name="mufassa";
        lion.age=5;
        lion.isMammal=true;
        */

        //instruction18
        lion.setFamily("felines");
        lion.setAge(10);
        lion.setName("mufassa");
        lion.setMammal(true);


        Zoo myZoo=new Zoo();
      /*  myZoo.name = "National tn.esprit.gestionzoo.entites.Zoo";
        myZoo.city = "TUNISIA";
        //myZoo.NBR_CAGES = 20;
        myZoo.animals = new tn.esprit.gestionzoo.entites.Animal[25];*/

        myZoo.setName("nation park");
        myZoo.setCity("tunisia");


        Animal elephant=new Animal("elephant","elephants",10,true);
        Animal alligator=new Animal("see ya later","alligator",20,false);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println("-------------------------addalionand elephant------------------------");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println("-------------------------addaligator1------------------------");
        System.out.println(myZoo.addAnimal(alligator));
        System.out.println("-------------------------addaligator2-------------------------");
        System.out.println(myZoo.addAnimal(alligator));
        System.out.println("-------------------------displayanimal-------------------------");
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));

        //instruction 21
        //Aquatic aquatic = new Aquatic("fish", "dorry", 3, false, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Lion", "Simba", 3, true, 4);
        Dolphin dolphin = new Dolphin("dolphins", "doffy", 5, true, "Ocean", 0.5f);
        Penguin penguin = new Penguin("penguins", "Cesar", 5, true, "Ocean", 0.5f);
       // aquatic.swim();
        dolphin.swim();
        penguin.swim();

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
    }
}
