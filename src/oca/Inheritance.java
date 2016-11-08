package oca;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

public class Inheritance {

    /**************************************************************************************************************************
     *
     * Inheritance
     *
     *************************************************************************************************************************/

    class Parent {
        final int i = 10;

        public void print() {
            System.out.println("parent");
        }
    }

    class Child extends Parent {
        int i = 20; // This variable is hiding the value from the parent class, although its declared final in the Parent it is still allowed to define it in the Child class.

        public Child(int i) {
            /**
             * If a declaration of a type (such as a member variable or a parameter name) in a particular scope (such as an inner class or a method definition) has the same name as another declaration in the enclosing scope, then the declaration shadows the declaration of the enclosing scope. You cannot refer to a shadowed declaration by its name alone.
             */
            System.out.println(i); // prints: 5
            System.out.println(this.i); // prints: 20
            System.out.println(super.i); // prints: 10
            System.out.println(Inheritance.Child.this.i); // prints: 20
            System.out.println(((Inheritance.Parent) this).i); // prints: 10
            System.out.println(this instanceof Parent); // prints: true
            super.print(); // prints: parent
        }
    }

    /**************************************************************************************************************************
     *
     * Abstract and concrete classes
     *
     *************************************************************************************************************************/

    abstract class SomeAbstractClass {
        abstract void doingNothing();

        void someOtherMethod() {
            // Just a method
        }
    }

    abstract class SomeOtherAbstractClass extends SomeAbstractClass {
        abstract void otherMethodDoingNothing();

        /**
         * This class is abstract, so it is not required to override or implement any methods, but is allowed!
         */
        @Override
        void someOtherMethod() {
        }
    }

    abstract class EvenMoreAbstract extends SomeOtherAbstractClass {
        /**
         * This abstract class does not have any abstract methods, which is allowed.
         */
    }

    class ConcreteClass extends EvenMoreAbstract /* we must implement all abstract methods from the abstract class */ {

        @Override
        void doingNothing() {
        }

        @Override
        void otherMethodDoingNothing() {
        }
    }

    class OtherConcreteClass extends ConcreteClass, Parent /* Compilation failure, cannot extend multiple classes */ {

        @Override
        void doingNothing() {
        }

        @Override
        void otherMethodDoingNothing() {
        }
    }

    class SomeOtherConcreteClass extends Parent implements Serializable, Runnable
            /* implementing multiple interfaces is allowed */ {

        /**
         * Required to implement the run method from the Runnable interface.
         */
        @Override
        public void run() {
        }
    }

    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.new Child(5);
        i.new ConcreteClass();
        i.new SomeAbstractClass(); // Compilation failure, not allowed to instantiate an abstract class.
    }
}
