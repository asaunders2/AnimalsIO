package com.saunders2;

/** Defines the attributes and behavior of the Dog object
 * @author mgreen14
 * @author asaunders2
 * @version 1.1, 9/1/2018
 */


public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Constructs a new Dog with a friendliness flag and name
     * @param friendly the indicator whether the Dog is friendly as a boolean value
     * @param name     the name of the Dog inherited from the super class represented as a string
     */

    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * Returns the indication of whether the Dog is friendly
     * @return the friendliness indicator of the Dog using the friendly boolean
     */

    public boolean isFriendly() {

        return friendly;
    }

    /**
     * Returns the Dog's speech, overriding parent classes' speech
     * @return the speech of the Dog
     */

    @Override
    public String talk() {
        return "Bark";
    }

    /**
     * Returns the Dog object's String representation, overriding the Parent classes' toString method
     * @return the String representing the Dog object's name and
     * whether or not it is friendly
     */

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}