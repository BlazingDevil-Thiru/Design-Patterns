package org.thiru.singleton;

import java.io.Serializable;

public class BillPughImpl implements Serializable , Cloneable {
    private int id;
    private String name;

    private BillPughImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private static class SingletonHelper{
        private static final BillPughImpl INSTANCE = new BillPughImpl(0, "");
    }

    public static BillPughImpl getInstance() throws InterruptedException {
        Thread.sleep(1000);
        return SingletonHelper.INSTANCE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BillPughImpl clone() throws CloneNotSupportedException {
        return (BillPughImpl) super.clone();
    }
}
