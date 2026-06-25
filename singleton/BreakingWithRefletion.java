package org.thiru.singleton;

import java.lang.reflect.Constructor;

public class BreakingWithRefletion {
    public static void main(String[] args) throws Exception {
        Constructor<BillPughImpl> p1 = BillPughImpl.class.getDeclaredConstructor(
                int.class, String.class
        );
        p1.setAccessible(true);

        BillPughImpl ob1 = p1.newInstance(1, "thiru");
        BillPughImpl ob2 = BillPughImpl.getInstance();
        System.out.println(System.identityHashCode(ob1));
        System.out.println(System.identityHashCode(ob2));
    }
}
