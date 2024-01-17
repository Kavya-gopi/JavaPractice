package com.practice;

public class Circle {
    /*Create a class called 'Circle' with an attributed 'radius'. Include a method called 'calculateCircumference()' that calculates and returns the circumference of the circle.
Create an object of the 'Circle' class and test the 'calculateCircumference()' method.
*/

        private int radius;

        public Circle(){}

        public Circle(int radius){
            this.radius=radius;
        }

        public void setRadius(int radius){
            this.radius=radius;
        }

        public int getRadius(){
            return radius;
        }

        public double calculateCircumference(){
            return 2*3.14*this.radius;

        }



    }






