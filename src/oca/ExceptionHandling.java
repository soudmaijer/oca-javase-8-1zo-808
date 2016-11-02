package oca;

public class ExceptionHandling {

    public class MyException extends Exception {
    }

    /**************************************************************************************************************************
     *
     * Throws and throw
     *
     *************************************************************************************************************************/

    void doSomeThingThatThrowsACheckedException() throws MyException /* required to specify all check exception! */ {
        throw new MyException();
    }

    void doSomeThingThatThrowsARuntimeException() {
        throw new RuntimeException();
    }

    void doSomeThingThatThrowsAnError() {
        throw new Error(); // you should never throw this yourself, prefer using a checked or RuntimeException.
    }

    /**************************************************************************************************************************
     *
     * Handling checked Exceptions
     *
     *************************************************************************************************************************/

    void handlingCheckedExceptions() {
        /**
         * Checked exceptions need to be caught or declared in the throws of the method.
         */
        try {
            doSomeThingThatThrowsACheckedException();
        } catch (MyException e) /* handing specific exception types */ {
            e.printStackTrace();
        } catch (Exception e) /* general exception types */ {
            // Code never reached because doSomeThingThatThrowsAnCheckedException throws a MyException which is already handled in the catch block above.
            e.printStackTrace();
        }
    }

    void notHandlingCheckedExceptions() throws Exception {
        /**
         * Checked exceptions need to be caught or declared in the throws of the method.
         */
        doSomeThingThatThrowsACheckedException();
    }

    /**************************************************************************************************************************
     *
     * Handling RuntimeExceptions
     *
     *************************************************************************************************************************/

    void handlingRuntimeExceptions() {
        /**
         * You can explicitly catch a RuntimeException, but it is not required to do so, also not required to specify throws.
         */
        doSomeThingThatThrowsARuntimeException();
    }

    /**************************************************************************************************************************
     *
     * Finally
     *
     *************************************************************************************************************************/

    void finallyOnlyExecutesInCaseOfAnException() {
        try {
            if (false) {
                // this never happens
                doSomeThingThatThrowsARuntimeException();
            }
        } finally {
            // Finally only executes in case of an exception, so this code here is never reached.
            System.out.println("Some exception occurred here... but not handling it.");
        }
    }
}

