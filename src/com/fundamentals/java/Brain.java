package com.fundamentals.java;
    /*
    *Since it's static, properties are accessed via the class
    * name instead of making an object of the class
    * Showing an example of a static inner class;
    * Patterned after example on pages 82-83
    * */

class Brain {

    static class Idea {                 //static inner class creation
        static public String shoeString;    //properties of the static inner class - see main
        static public String pop;
    }

    public void TieShoe()
    {
        Idea.shoeString = "thought";
        System.out.println("I just now " + Idea.shoeString + " of an idea.\n");
    }
    public void Bottle()
    {
        Idea.pop = "soda";
        System.out.println("There is root beer flavored " + Idea.pop + " pop inside the bottle.\n" );
    }

}
