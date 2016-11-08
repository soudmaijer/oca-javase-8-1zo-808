package oca;

public class BreakContinueReturn {

    public BreakContinueReturn() {
    }

    public void whileBreak() {
        int i = 42;
        do {
            if (i % 41 == 0) {
                break;
            }
            System.out.println(i);
        } while (i-- >= 0);
        System.out.println("end");
    }

    public void whileReturn() {
        int i = 42;
        do {
            if (i % 41 == 0) {
                return;
            }
            System.out.println(i);
        } while (i-- >= 0);
        System.out.println("end");
    }

    public void forBreak() {
        int[] ints = {1, 2, 3};
        for (int i : ints) {
            System.out.println(i);
            break;
        }
    }

    public void forBreakWithLabel() {
        int[] ints = {1, 2, 3};
        some_label:
        for (int i : ints) {
            System.out.println(i);
            break some_label;
        }
    }

    public void forContinue() {
        int[] ints = {1, 2, 3};
        for (int i : ints) {
            System.out.println(i);
            continue;
        }
    }

    public void forContinueWithLabel() {
        int[] ints = {1, 2, 3};
        some_label:
        for (int i : ints) {
            System.out.println(i);
            continue some_label;
        }
    }

    public static void main(String[] args) {
        BreakContinueReturn b = new BreakContinueReturn();
        b.whileBreak(); // prints 42 end
        b.whileReturn(); // prints 42
        b.forBreak(); // prints 1
        b.forBreakWithLabel(); // prints 1
        b.forContinue(); // prints 1 2 3
        b.forContinueWithLabel(); // prints 1 2 3
    }
}