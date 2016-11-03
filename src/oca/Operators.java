package oca;

/**
 * https://www.tutorialspoint.com/java/java_basic_operators.htm
 */
public class Operators {

    public Operators() {

        // Binary operators

        int a = 0b1000_0000_0000_0000_0000_0000_0011_1100;
        int b = 0b0000_0000_0000_0000_0000_0000_0000_1101;

        System.out.println(Integer.toBinaryString(a ^ b));      // prints: 10000000000000000000000000110001 - xor (copies the bit if it is set in one operand but not both.)
        System.out.println(Integer.toBinaryString(a | b));      // prints: 10000000000000000000000000111101 - or
        System.out.println(Integer.toBinaryString(a & b));      // prints: 00000000000000000000000000001100 - and
        System.out.println(Integer.toBinaryString(~a));         // prints: 01111111111111111111111111000011 - flip
        System.out.println(Integer.toBinaryString(a >> 2));     // prints: 11100000000000000000000000001111 - shift right (preserving 1)
        System.out.println(Integer.toBinaryString(b >> 2));     // prints: 00000000000000000000000000000011 - shift right (preserving 0)
        System.out.println(Integer.toBinaryString(a << 2));     // prints: 00000000000000000000000011110000 - shift left
        System.out.println(Integer.toBinaryString(a >>> 2));    // prints: 00100000000000000000000000001111 - shift right (zero fill)
    }

    public static void main(String[] args) {
        new Operators();
    }
}