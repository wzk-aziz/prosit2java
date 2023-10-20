/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package tn.esprit.gestionzoo.entites;

public non-sealed class Aquatic extends Animal {

    private String habitat;

    public Aquatic()
    {

    }
    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {

        super(family, name, age, isMammal);

        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //on peut herité un methode de la class mére dans la classe fille meme si elle est private
    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }
    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
}
