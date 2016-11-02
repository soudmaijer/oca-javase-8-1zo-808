package oca;

public class OverridingVsOverloading {

    public class Parent {
        final int i = 10;

        public boolean returnSomething() {
            return true;
        }
    }

    public class Child extends Parent {
        int i = 20; // This variable is hiding the value from the parent class, although its declared final in the Parent it is still allowed to define it in the Child class.

        /**
         * Overriding the implementation of the parent class.
         */
        @Override
        public boolean returnSomething() {
            return super.returnSomething();
        }

        /**
         * This is called overloading. Number of parameters changed.
         */
        public boolean returnSomething(boolean value) {
            return value;
        }

        /**
         * This is called overloading. Parameter type has changed.
         */
        public boolean returnSomething(int value) {
            return value == 1;
        }

        /**
         * This is an invalid form of overloading. Only the return type has changed here and is therefore clashing with: public boolean returnSomething(int value) which has the same number of method arguments.
         */
        public char returnSomething(int otherVal) {
            return (char) otherVal;
        }
    }
}