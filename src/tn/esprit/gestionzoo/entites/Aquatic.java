/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package tn.esprit.gestionzoo.entites;

import java.util.Objects;

public abstract non-sealed class Aquatic extends Animal {

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
    /*public void swim(){
        System.out.println("this aquatic animal is swimming");
    }*/
    //instruction 28
    public abstract void swim();

    /*@Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(this == o)
            return true;
        if(!this.getClass().equals(o.getClass()))
            return false;
        final Aquatic other = (Aquatic) o;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && habitat.equals(other.habitat);
    }*/

// instruction 30
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return Objects.equals(getName(), other.getName()) &&
                Objects.equals(getAge(), other.getAge()) &&
                Objects.equals(getHabitat(), other.getHabitat());
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
}
