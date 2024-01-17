package com.practice.interfacedemo.Demo1;

/*Create another interface called 'Resizable' with a method 'resize(double factor)'
that resize the shape by a given factor.
 */

public interface Resizable {
    public void resize(int length,int breadth);
    public void resize(double radius);
}
