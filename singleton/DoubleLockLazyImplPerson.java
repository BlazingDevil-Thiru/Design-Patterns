package org.thiru.singleton;

public class DoubleLockLazyImplPerson {
    private int id;
    private String name;

    private static DoubleLockLazyImplPerson INSTANCE;

    public static DoubleLockLazyImplPerson getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            synchronized (DoubleLockLazyImplPerson.class) {
                if (INSTANCE == null) {
                    Thread.sleep(400);
                    INSTANCE = new DoubleLockLazyImplPerson(0, "");
                }
            }
        }
        return INSTANCE;
    }


    private DoubleLockLazyImplPerson(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
