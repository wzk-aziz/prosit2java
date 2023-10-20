/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package tn.esprit.gestionzoo.entites;

public class Dolphin extends Aquatic{
    private float swimmingspeed;

    public Dolphin(float swimmingspeed) {
        this.swimmingspeed = swimmingspeed;
    }

    public Dolphin(String habitat, float swimmingspeed) {
        super(habitat);
        this.swimmingspeed = swimmingspeed;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingspeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingspeed = swimmingspeed;
    }

    public float getSwimmingspeed() {
        return swimmingspeed;
    }

    public void setSwimmingspeed(float swimmingspeed) {
        this.swimmingspeed = swimmingspeed;
    }
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingspeed=" + swimmingspeed +
                '}';
    }
}
