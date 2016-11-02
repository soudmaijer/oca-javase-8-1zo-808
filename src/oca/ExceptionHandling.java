package oca;

public class ExceptionHandling {

    public class MyException extends Exception {
    }

    public class MyExceptionSub extends MyException {
    }

    /**************************************************************************************************************************
     *
     * Throws and throw
     *
     *************************************************************************************************************************/

    void doSomeThingThatThrowsACheckedException() throws MyException /* required to specify all check exception! */ {
        throw new MyException();
    }

    void doSomeThingElseThatThrowsACheckedException() throws Exception /* parent class of MyException is allowed */ {
        throw new MyException();
    }

    void doSomeThingThatThrowsARuntimeException() {
        throw new RuntimeException();
    }

    void doSomeThingThatThrowsAnError() {
        throw new Error(); // you should never throw this yourself, prefer using a checked or RuntimeException.
    }

    static class ExceptionHandlingChild1 extends ExceptionHandling {
        @Override
        void doSomeThingThatThrowsACheckedException() {
            // even though we are overriding the method, we dont throw an exception here, so the throws is not required
        }
    }

    static class ExceptionHandlingChild2 extends ExceptionHandling {
        @Override
        void doSomeThingThatThrowsACheckedException() throws Exception
            /* compilation fails because only MyException and subclasses of MyException are allowed */ {
        }
    }

    static class ExceptionHandlingChild3 extends ExceptionHandling {
        @Override
        void doSomeThingThatThrowsACheckedException() throws MyExceptionSub /* subclasses of MyException are allowed */ {
        }
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

    void finallyAlwaysExecutes() {
        try {
            if (false) {
                // this never happens
                doSomeThingThatThrowsARuntimeException();
            }
        } finally {
            // Finally always executes, also after an exception.
            System.out.println("Some exception occurred here... but not handling it.");
        }
        // Resumes normal execution
        System.out.println("Resume normal execution.");
    }

    void finallyAlwaysExecutesButReturnsAfterAnException() {
        try {
            if (true) {
                // this never happens
                doSomeThingThatThrowsARuntimeException();
            }
        } finally {
            // Finally always executes, also after an exception.
            System.out.println("Some exception occurred here... but not handling it.");
        }
        // This code is never reached.
        System.out.println("Never reached!");
    }
}

