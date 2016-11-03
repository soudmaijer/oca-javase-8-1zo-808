package oca;

public class Switch {

    public Switch() {
        switchTest('a'); // prints a, done, end
        switchTest('b'); // prints default, a, done, end
        switchTest('c'); // prints c, end
        switchTest('d'); // prints d
    }

    public void switchTest(int a) {

        switch (a) {
            case 'd': // switch labels need to be compile time constants
                System.out.println("d");
                return; // returns from the method
            case 'c':
                System.out.println("c");
                break; // stops the switch
            default:
                System.out.println("default");
            case 'a': // switch labels need to be compile time constants
                System.out.println("a");

            System.out.println("done");
        }
        System.out.println("end");
    }

    public static void main(String args[]) {
        new Switch();
    }
}
