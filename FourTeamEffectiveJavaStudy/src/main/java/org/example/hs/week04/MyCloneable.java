package org.example.hs.week04;

public class MyCloneable implements Cloneable{
    private String name;

    public MyCloneable(String name) {
        this.name = name;
    }

    public void chgName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected MyCloneable clone() throws CloneNotSupportedException {
        return (MyCloneable)super.clone();
    }

    @Override
    public String toString() {
        return "MyCloneable{" +
                "name='" + name + '\'' +
                '}';
    }
}
