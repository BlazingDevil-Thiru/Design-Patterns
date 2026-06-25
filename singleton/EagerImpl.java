package org.thiru.singleton;


public class EagerImpl {
    private int id;
    private String name;

    private static final EagerImpl INSTANCE = new EagerImpl(0, "");

    public static EagerImpl getInstance() {return INSTANCE;}


    private EagerImpl(int id, String name) {
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
