package com.saunders2;

/**Defines the attributes and behavior of the Pet object
 * @author mgreen14
 * @author asaunders2
 * @bersion 1.1, 9/1/20018
 */
public abstract class Pet {
    protected String name;

    /**
     * Sets the name of the Pet object
     * @param name the string value of the pet being passed in
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the Pet object
     * @return returns the string for the name of the pet
     */
    public String getName() {
        return name;
    }


}