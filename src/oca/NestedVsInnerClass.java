package oca;

public class NestedVsInnerClass {

    // Static class inside another class is called nested class
    // Non-static nested classes are called inner classes
    private static class NestedClass {
    }

    public static void main(String[] args) {

        // StaticNestedClass is accessible without using an instance of NestedVsInnerClass because it is static
        NestedClass n = new NestedClass();

        // InnerClasses is a class outside of NestedVsInnerClass
        InnerClasses c = new InnerClasses();
        c.new PublicInnerClass(); // visible because public
        c.new ProtectedInnerClass(); // visible in the same package, but also visible outside oca package if extended
        c.new PackageInnerClass(); // only visible the same package
        c.new PrivateInnerClass(); // not visible, compilation error!
    }
}

