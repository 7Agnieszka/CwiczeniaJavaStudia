package projekt;

import java.lang.Math;

public class Circle {


    static int noOfObjects = 0;




    /*
    Circle
radius: double
Circle()
Circle(r: double)
getRadius(): double
setRadius(r: double): void
getPerimeter(): double
getArea(): double

     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        noOfObjects += 1;
    }

    public Circle() {
        this(0.0);
        noOfObjects += 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getParimeter()
    {
        return getRadius() * 2 * Math.PI;
    }

    public double getArea()
    {
        return getRadius() * getRadius() * Math.PI;
    }


    boolean equals(Circle o)
    {
        if(this.radius == o.radius)
            return true;
        return false;
    }



/*
    // Java program Find Out the Number of Objects Created
// of a Class
    class Test {

        static int noOfObjects = 0;

        // non-parameterized constructor. Unlike other non-static
        // functions, a constructor can access static members
        public Test()
        {
            noOfObjects += 1;
        }

        public static void main(String args[])
        {
            Test t1 = new Test();
            Test t2 = new Test();
            Test t3 = new Test();

            // We can also write t1.noOfObjects or
            // t2.noOfObjects or t3.noOfObjects
            System.out.println(Test.noOfObjects);
        }
    }

*/






}
