/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package tn.esprit.gestionzoo.entites;

public class Penguin extends Aquatic {

    private float swimmingDepth;

    public Penguin(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }


    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}
