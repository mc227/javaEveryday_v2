package com.codegym.task.task21.task2109;

/*
Prevent cloning
Allow cloning of the A class
Prevent cloning of the B class
Allow cloning of the C class
Don't forget about the equals and hashCode methods!

Requirements:
•	The A class should support the Cloneable interface.
•	The B class must be a descendant of the A class.
•	The B class's declaration should not explicitly state "implements Cloneable".
•	The B class's clone method must be overridden in such a way that an attempt to clone a B object will generate a CloneNotSupportedException.
•	The C class must be a descendant of the B class.
•	C objects must be cloned successfully
*/

public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new C(getI(), getJ(), getName());
        }
    }

    public static void main(String[] args) {

    }
}
