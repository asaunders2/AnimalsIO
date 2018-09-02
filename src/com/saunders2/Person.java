package com.saunders2;

/**Defines the attributes and behavior of the Person object
 * @author mgreen14
 * @author asaunders2
 * @version 1.1, 9/1/2018
 */

public abstract class Person {
    private String name;

    /**
     * Constructs a new Person with their name attribute
     * @param name the string showing the person's name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the Person object
     * @return returns the string name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Person object
     * @param name a string being passed into the method
     */
    public void setName(String name) {
        this.name = name;
    }


}