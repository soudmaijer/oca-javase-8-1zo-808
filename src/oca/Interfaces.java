package oca;

public class Interfaces {

    /**************************************************************************************************************************
     *
     * Inheritance
     *
     *************************************************************************************************************************/

    public interface ParentInterface {
        public static final int SOME_CONTANT_VALUE = 0; // public static final can be omitted because that is the default for constant declarations in an interface.
    }

    public interface ChildInterface extends ParentInterface {
    }

    /**
     * Interfaces can only extend other interfaces but can never implement other interfaces.
     */
    public interface ImplementsNotAllowedForInterfaces implements ParentInterface {
    }


    /**************************************************************************************************************************
     *
     * Functional interfaces
     *
     *************************************************************************************************************************/

    @java.lang.FunctionalInterface
    public interface MyFunctionalInterface {

        /**
         * All methods in an interface are by default public abstract, so public and abstract can be omitted.
         */
        public abstract void someMethod();

        /**
         * Functional interfaces should have exactly 1 public method but are allowed to have other default or static methods.
         */
        void notAllowedToHaveSomeOtherMethod();

        default void someDefaultMethodDoingNothing() {
            // doing nothing!
        }

        static void someStaticMethodDoingNothing() {
            // doing nothing!
        }
    }

}
