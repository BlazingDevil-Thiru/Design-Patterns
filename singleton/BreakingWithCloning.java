package org.thiru.singleton;

public class BreakingWithCloning {
    public static void main(String[] args) throws Exception {
        BillPughImpl ob1 = BillPughImpl.getInstance();
        BillPughImpl ob2 = ob1.clone();
        System.out.println(System.identityHashCode(ob1));
        System.out.println(System.identityHashCode(ob2));
    }
}
