package com.fundamentals.java;
/*
* Patterned after example on pages 79-80
* */
class Outdoors {
    class Indoors {
        public int insideID;        //the inner class contains properties
        public String middle;
        public String bullseye;
        public int number;
    }

    /*
    * outer class has methods to make objects out of
    * the class to display the values of the properties
    * */
    public void ShowInside()
    {
        Indoors refvar = new Indoors();
        refvar.insideID = 4;
        System.out.println("The number for the indoor class is " + refvar.insideID + "\n");
    }
    public void notMiddle()
    {
        Indoors mi = new Indoors();
        mi.middle = "the very center";
        System.out.println("The variable is being called from the class that is in " + mi.middle + "\n");
    }

    public void target ()
    {
        Indoors bi = new Indoors();
        bi.bullseye = "target";
        System.out.println("The bullseye is the very center of the " + bi.bullseye + "\n");
    }
    public void five ()
    {
        Indoors no = new Indoors();
        no.number = 5;
        System.out.println("The half way point between 0 and 10 would be " + no.number + "\n");



    }
}

