package oca;

import java.util.ArrayList;
import java.util.List;

public class ExamSampleQuestions {

    class Baap {
        public int h = 4;

        public int getH() {
            System.out.println("Baap " + h);
            return h;
        }

        public class Beta extends oca.Baap {
            public int h = 44;

            public int getH() {
                System.out.println("Beta " + h);
                return h;
            }

            public static void main(String[] args) {
                oca.Baap b = new Beta();
                System.out.println(b.h + " " + b.getH());
                Beta bb = (Beta) b;
                System.out.println(bb.h + " " + bb.getH());
            }
        }
    }

    public void example0() {
        for (int i = 0; i < 10; ) {
            i = i++;
        }
    }

    public void example1() {
        List<String> list = new ArrayList<>();
        list.add("BE");
        list.add("EE");
        list.add("BE");
        list.add("EE");

        list.remove("BE");

        System.out.println("Values are: " + list);
    }

    public void example2() {

        String[][] table = {
                {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"},
                {"1", "2", "3", "4", "5"},
                {"a", "b", "c"}
        };

        String[] s = {"1", "2"};

        for (String[] row : table) {
            System.out.print(row[row.length - 1]);
        }
    }

    public static String example3(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        String y = x.concat(creditCard.substring(15));
        return y;
    }

    public static void main(String[] args) {
        System.out.println(example3("1234-5678-9101-1121"));
    }
}