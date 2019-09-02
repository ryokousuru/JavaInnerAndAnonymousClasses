package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {

        //simpleInnerClassExample();
        objectOfInnerClass();
        //staticInnerClassExample();
        //anonymousClassExample();
        //anonWithPropertiesExample();
        //shareInterfaceExample();
    }

    /*
     * Using an object in the outside class to display
     * a value in an inside class; pages 79-80
     * */
    public static void simpleInnerClassExample() {
        Outdoors od = new Outdoors();
        od.ShowInside();
        Outdoors mi = new Outdoors();
        mi.notMiddle();
        Outdoors bi = new Outdoors();
        bi.target();
        Outdoors nu = new Outdoors();
        nu.five();
    }

    /*
     *Demonstrating how to create an object
     * of the inner class from the Main program
     * page 81
     */
    public static void objectOfInnerClass() {
        Rural ru = new Rural();         // an object of the outer class in the main program
        ru.ShowUrban();

        Rural.Urban urb = ru.new Urban();   // an object of the inner class using 'new' keyword on the outer object
        urb.urbanLocation = "branch";
        System.out.println("All other parts of the city " + urb.urbanLocation + " out from the center of town.\n");

        Rural rr = new Rural();
        rr.Circle();

        Rural.Urban ua = rr.new Urban();
        ua.center = "axle";
        System.out.println("The very center of the wheel is the " + ua.center + "\n");
    }

    /*
     * Since it's static, properties are accessed via the class
     * name instead of making an object of the class
     * Showing an example of a static inner class; pages 82-83
     * */
    public static void staticInnerClassExample() {
        Brain br = new Brain();
        br.TieShoe();

        Brain.Idea.shoeString = "invention";
        System.out.println("Every great " + Brain.Idea.shoeString +
                " originates as an idea.\n");

        Brain ra = new Brain();
        ra.Bottle();

        Brain.Idea.pop = "float";                                   //using inner class name to
        System.out.println("I\'d like a " + Brain.Idea.pop +        // reference it's properties
                " made of vanilla ice cream and cream soda.\n");
    }
    /*
     * Showing how to use anonymous classes
     *  example pages 85-86
     * */

    public static void anonymousClassExample() {
        Cloud cd = new Cloud() {                    //create object for anonymous class

            public void Emerge() {
                System.out.println("The airplane emerges from the cloud.\n");   //define implementation of
            }                                                                   //methods for anonymous class
            public void Show() {
                System.out.println("They\'re going to attend the show this evening.\n");
            }
            public void Seen() {
                System.out.println("Another example can be seen below.\n");
            }
            public void Several() {
                System.out.println("Several different examples are being used to illustrate.\n");

            }
        };
        cd.Emerge();                //calling the methods of the objects
        cd.Show();
        cd.Seen();
        cd.Several();
    }
    /*
     * Showing how to use anonymous classes
     *  with properties - example pages 86-87
     * */
    public static void anonWithPropertiesExample() {
        Shoestring sh = new Shoestring() {
            String Eyelets = "fourteen";                    //defining properties in
            String Returning = "arriving back home";        //the anonymous class
            String Complexion = "bright yellow";
            String Each = "rope";
            public void TieUp() {
                System.out.println("The number of eyelets " +           //referenceing properties
                        "is " + this.Eyelets + ".\n");                  //in methods for
            }                                                           //anonymous classes
            public void UnTie() {
                System.out.println("Upon " + this.Returning +
                        ", he untied his shoes.\n");
            }
            public void Color() {
                System.out.println("The color of her shoestrings " +
                        "is " + this.Complexion + ".\n");
            }
            public void Both() {
                System.out.println("Tie both shoelaces together " +
                        "in order to make a " + this.Each + ".\n");
            }
        };
        sh.TieUp();
        sh.UnTie();
        sh.Color();
        sh.Both();
    }
    /*
     * Showing how to define an interface and create
     *  an object out of it  - example page 88
     * */
    public static void shareInterfaceExample() {
        Share um = new Share() {                                //create an object out of the
            public void Umbrella() {                            //interface and implement
                System.out.println("Would you like to " +       //its methods
                        "share an umbrella?\n");
            }
            public void Calendar() {
                System.out.println("The first month on the " +
                        "calendar is January\n");
            }
            public void April() {
                System.out.println("April is the rainy month " +
                        "of Spring.\n" );
            }
            public void May() {
                System.out.println("There is a famous " +
                        "Mexican holiday in the month of May.");
            }
        };
        um.Umbrella();                                      //calling the methods
        um.Calendar();
        um.April();
        um.May();
    }

}