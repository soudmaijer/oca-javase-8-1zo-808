package oca;

public class Constructors {

    public class DefaultConstructor {
        // default constructor generated
    }

    /**
     * It is allowed to have public inner classes, but a static inner class is more convenient.
     */
    public class Parent {
        public Parent() {
            // If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
            // If the super class does not have a no-argument constructor, you will get a compile-time error. Object does have such a constructor, so if Object is the only superclass, there is no problem.
        }
    }

    public class Child extends Parent {
        // When not defining a Constructor, a default constructor is generated which looks like (empty body!):
        //
        // public Child {
        // }
    }

    public class Child1 extends Parent {
        public Child1() {
            super(); // Compilation fails here because call to super should always be the first statement in a constructor!
        }
    }

    public class Child2 extends Parent {
        private boolean b;

        public Child2() {
            super();
            this(true); // Compilation fails here, not allowed to have both super and this
        }

        public Child2(boolean b) {
            this.b = b;
        }
    }

    public class Child3 extends Parent {
        private boolean b;

        public Child3() {
            this(true);
        }

        public Child3(boolean b) {
            super();
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Constructors c = new Constructors();
        Parent parent = c.new Parent(); // super weird, but correct
        c.new Child(); // super weird, but correct
    }
}

