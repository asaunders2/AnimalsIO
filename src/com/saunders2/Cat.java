package com.saunders2;

/** Defines the attributes and behavior of the Cat object
 * @author mgreen14
 * @author asaunders2
 * @version 1.1 9/1/2018
 */

public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Constructs a new Cat with a mousesKilled value and name
     * @param mousesKilled the integer that tracks number of mice killed
     * @param name         the string showing the name of the cat
     */

    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * Returns the mousesKilled integer value
     * @return returns number of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Sets the value of mousesKilled to number of mice killed + 1
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Returns the talk for the Cat, overriding the parent's speech class
     * @return Returns the speech of the Cat as a string
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     * Returns the Cat object's String representation, overriding the parent's toString method
     * @return returns a string containing the cat's name and number of mice killed
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }

    public void addCat(){
        
    }

}

