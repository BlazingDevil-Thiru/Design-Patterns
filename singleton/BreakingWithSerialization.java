package org.thiru.singleton;

import java.io.*;

public class BreakingWithSerialization {
    public static void main(String[] args) throws Exception {
        BillPughImpl ob1 = BillPughImpl.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(ob1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        BillPughImpl ob2 = (BillPughImpl) ois.readObject();


        System.out.println(System.identityHashCode(ob1));
        System.out.println(System.identityHashCode(ob2));
    }
}
