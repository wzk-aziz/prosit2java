/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.Animal;
import tn.esprit.gestionzoo.entites.Zoo;

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


    }
}
