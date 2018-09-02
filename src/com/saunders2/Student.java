package com.saunders2;

/**Defines the attributes and behavior of the Student object
 * @author mgreen14
 * @author asaunders2
 * @version 1.1, 9/1/2018
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Constructs a new Student with an age and a name passed in as parameters
     * @param age  the integer value age for the Student Object
     * @param name the string showing the name of the person
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * Returns the age of the Student object
     * @return returns an int for the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the Student object
     * @param age is an int that is used to set age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the Student Object's string, overriding the Parent classes' toString method
     * @return returns a string
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
