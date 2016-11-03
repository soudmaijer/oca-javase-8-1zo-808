package oca;

public class OverloadingVsOverriding {

    public class Parent {

        /**************************************************************************************************************************
         *
         * Overloading
         *
         *************************************************************************************************************************/

        public boolean returnSomething() {
            return true;
        }

        /**
         * This is called overloading, same method name with different number of parameters.
         */
        public boolean returnSomething(boolean value) {
            return value;
        }

        /**
         * This is called overloading, same sequence of parameters but the type has changed.
         */
        public boolean returnSomething(int value) {
            return value == 1;
        }

        /**
         * This is an invalid form of overloading because return type is ignored but there is already a method:
         * public boolean returnSomething(int value) which has the same number of method arguments.
         */
        public char returnSomething(int otherVal) { // gives a compilation error
            return (char) otherVal;
        }

        /**
         * This is valid overloading, because parameter type has changed, return type does not matter.
         */
        public String returnSomething(String value) {
            return value;
        }
    }

    public class Child extends Parent {

        /**************************************************************************************************************************
         *
         * Overriding
         *
         *************************************************************************************************************************/

        /**
         * Overriding the implementation of the parent class.
         */
        @Override
        public boolean returnSomething() {
            return super.returnSomething();
        }
    }
}