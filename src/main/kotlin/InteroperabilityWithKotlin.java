/* - Interoperability with Java and Kotlin */

import java.util.ArrayList;

public class InteroperabilityWithKotlin {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        System.out.println("Code inside Java class");
        InteroperabilityWithJavaKt.demo(ints);
    }
}
