package oca;

public class MemberVsInstanceVariableAndScoping {

    /**************************************************************************************************************************
     *
     * Class vs instance variables
     *
     *************************************************************************************************************************/

    private int i; // instance variable, will get a default value because it is a primitive type
    private static boolean b; // class variable, will get a default value because it is a primitive type
    private static final boolean c = false; // constant value, even though it is a primitive type, a constant need to have a value assign to it and does not get a default value.

    public void doSomething() {

        /**
         * Default value assigned to member variables
         */
        System.out.println(i); // will print 0
        System.out.println(b); // will print false

        /**
         * Local variable
         */
        int x; // local variable, no default value assigned
        if (false) {
            x = 0;
        }
        System.out.println(x); // compilation will fail here, because local variable x is not initialized.

        /**
         * Scoping
         */
        if (true) {
            int y = 0; // local variable are only visible withing the scope of enclosing method/if/while/for/do.
            System.out.println(y); // will print 0
        }
        System.out.println(y); // compilation will fail here, because y is not visible outside the scope of the if statement

        /**
         * Assignment not allowed in if without brackets.
         */
        if (true)
            int z = 0; // compilation will fail here, not allowed to declare inside an if without brackets.
    }
}

