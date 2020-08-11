package org.example.hs.week04;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyCloneable myCloneable = new MyCloneable("mesung");
        MyCloneable cloneMyCloneable = myCloneable.clone();
        System.out.println(cloneMyCloneable.getName().equals(myCloneable.getName()));

        System.out.println(cloneMyCloneable);
        cloneMyCloneable.chgName("ime_sung");
        System.out.println(cloneMyCloneable);
    }
}
