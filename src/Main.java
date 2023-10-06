/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

public class Main {
    public static void main(String[] args) {
        Animal lion=new Animal();
        lion.family="felines";
        lion.name="mufassa";
        lion.age=5;
        lion.isMammal=true;

        Zoo myZoo=new Zoo();
        myZoo.name = "National Zoo";
        myZoo.city = "TUNISIA";
        //myZoo.NBR_CAGES = 20;
        myZoo.animals = new Animal[25];

        Animal elephant=new Animal("elephant","elephants",10,true);
        Animal alligator=new Animal("see ya later","alligator",20,false);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.addAnimal(alligator));

        System.out.println(myZoo.searchAnimal(lion));


    }
}
