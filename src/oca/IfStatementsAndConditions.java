package oca;

public class IfStatementsAndConditions {

    public void bitwiseOr() {
        boolean a = true;
        boolean b = false;

        // Bitwise or, both operands are evaluated.
        if (a | (b = true)) {
            System.err.println("a=" + a + ", b=" + b); // prints a=true, b=true
        }
    }

    public void bitwiseAnd() {
        boolean a = false;
        boolean b = false;

        // Bitwise or, both operands are evaluated.
        if (a & (b = true)) {
            // never reached
        }
        System.err.println("a=" + a + ", b=" + b); // prints a=false, b=true
    }

    public void shortCircuitOr() {
        boolean a = true;
        boolean b = false;

        // Because a == true, the right hand side does not need to be validated, short circuited.
        if (a || (b = true)) {
            System.err.println("a=" + a + ", b=" + b); // prints a=true, b=false
        }
    }

    public void shortCircuitAnd() {
        boolean a = false;
        boolean b = false;

        // Because a == false, the right hand side is never evaluated, short circuited.
        if (a && (b = true)) {
            // never reached
        }
        System.err.println("a=" + a + ", b=" + b); // prints a=false, b=false
    }

    public void usageOfFunctions() {
        // usage of functions is allowed in if
        if (returnTrue()) {
            // statement reached
        }
    }

    public boolean returnTrue() {
        return true;
    }

    public void returnInIf() {
        if (returnTrue()) return; {
            System.out.print("hello from if!"); // Never executed, because the return after the if statement!
        }
    }

    public void ifWithoutCurlyBraces() {
        boolean b = false;
        if (false)
        b = true;
        System.out.print("b="+ b); // prints b=false
    }


    public void localVariableDeclaration() {
        if (true) {
            boolean b;
            System.out.print("b=" + b); // compilation fails, local variable b does not have a value.
        }

        if (true)
            boolean b = false; // compilation fails, not allowed to declare a variable in if without curly braces.
            System.out.print("b=" + b);
    }
}