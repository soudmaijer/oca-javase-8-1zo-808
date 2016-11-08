package oca;

/**
 * Objects that are equal must have the same hash code within a running process
 *
 * Whenever you implement equals, you MUST also implement hashCode
 */
public class EqualsHashCode {

    private String email, phone;

    public EqualsHashCode(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EqualsHashCode that = (EqualsHashCode) o;

        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return phone != null ? phone.equals(that.phone) : that.phone == null;

    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        EqualsHashCode e1 = new EqualsHashCode("equals@hashcode.com", "0612345678");
        EqualsHashCode e2 = new EqualsHashCode("equals@hashcode.com", "0612345678");

        System.out.println(e1 == e2); // prints false
        System.out.println(e1 == e1); // prints true
        System.out.println(e1.hashCode() == e2.hashCode()); // prints true
        System.out.println(e1.equals(e2)); // prints true
    }
}