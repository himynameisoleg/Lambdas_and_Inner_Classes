import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name ;
    private LocalDate birthDate;

    private class Position {
        protected String name;
        protected double salary;

        @Override
        public String toString() {
            return "";
        }
    }
/*
    Create a
    member inner

    class called Position with two
            member variables:
    a name
    and a
    salary.Override the

    toString()

    method as
    specified in
    the instructions

     TODO
    Create a

    member variable(of Person) of type Position.


     TODO
    Create a
    constructor for
    Person that
    takes in
    two Strings.
    A name
    and a
    birthdate in

    ISO format(yyyy-mm-dd) and sets the corresponding memeber variables correctly

     TODO
    Create a
    getAge method
    that returns
    the age
    in years
    of this
    person.You need
    to use
    the Period

    class here.
     TODO
    Code the
    setPosition method.
    This should
    take one
    String and
    one double for
    the title
    and the
    salary respectively.

    /* TODO
    A getter for
    position.

            TODO
            Override the

    toString() method to display the person's name, age and position (with salary and title).
     TODO
    Finish closing
    curly braces
    and the
    class.
    */

}