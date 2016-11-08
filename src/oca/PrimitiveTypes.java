package oca;

public class PrimitiveTypes {

    byte b;             // 8-bit, minimum value of -128 and a maximum value of 127 (inclusive)
    short s;            // 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
    int i;              // 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.
    long l;             // 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1.
    float f;            // 32-bit IEEE 754 floating point. Its range is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification.
    double d;           // 64-bit IEEE 754 floating point. Its range is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification.
    char c;             // 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
    boolean bool;       // true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.

    // A literal is the source code representation of a fixed value; literals are represented directly in your code without requiring computation.
    String str = "I am also a literal";

    public PrimitiveTypes() {

        // Rules for widening: https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.2
        // Rules for narrowing: https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.3 (requires casting)

        int byte_to_int = b;                // ok: 8 -> 32
        byte int_to_byte = i;               // fails: 32 -> 8
        double long_to_double = l;          // ok: 64 -> 64
        long double_to_long = d;            // fails: long does not have decimal values
        short char_to_short = c;            // fails: char is unsigned, short is signed
        double float_to_double = f;         // ok: 32 -> 64
        char int_to_char = 0;               // ok: >= 0
        char negative_int_to_char = -1;     // fails: char range is >= 0
        boolean int_to_boolean = 0;         // fails: only booleans allowed

        // Integer Literals (Values of the integral types byte, short, int, and long can be created from int literals.)

        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;

        // Floating-Point Literals

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;

        // Character and String Literals

        // Literals of types char and String may contain any Unicode (UTF-16) characters

        // The Java programming language also supports a few special escape sequences for char and String literals: \b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash).
    }

    public static void main(String[] args) {
        new PrimitiveTypes();
    }
}