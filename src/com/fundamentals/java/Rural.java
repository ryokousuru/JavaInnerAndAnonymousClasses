package com.fundamentals.java;
/*
* Patterned after example on page 81
* see main program for explanation
* */
    class Rural
    {
        class Urban {
            public String urbanLocation;
            public String center;
        }
        public void ShowUrban()
        {
            Urban ur = new Urban();
            ur.urbanLocation = "downtown";
            System.out.println("The " + ur.urbanLocation + " part of town " +
                    "is the center of the city.\n");
        }

        public void Circle()
        {
            Urban rb = new Urban();
            rb.center = "radius";
            System.out.println("The distance from the center to a " +
                    "point on a circle is called the " + rb.center + "\n");
        }
}
