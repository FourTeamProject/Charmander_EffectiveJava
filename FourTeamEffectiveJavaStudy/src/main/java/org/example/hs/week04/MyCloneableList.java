package org.example.hs.week04;

import java.util.ArrayList;
import java.util.List;

public class MyCloneableList implements Cloneable{
    private String name;
    private List<String> nameList = new ArrayList<>();
    private Object[] elements = new Object[10];
    private int arrSize = 0;

    public MyCloneableList(String name) {
        addName(name);
    }

    public void chgName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addName(String name) {
        nameList.add(name);
        elements[arrSize++] = name;
        this.name = name;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public Object[] getElements() {
        return elements;
    }

    public void printArr() {
        for(int i = 0; i < this.elements.length; i++) {
            if (elements[i] == null) {
                continue;
            }
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    @Override
    protected MyCloneableList clone() throws CloneNotSupportedException {
        //return (MyCloneableList)super.clone();

        MyCloneableList myCloneableList = (MyCloneableList)super.clone();

        List<String> copyList = new ArrayList<>();
        for(int i = 0; i < this.nameList.size(); i++) {
            copyList.add(this.nameList.get(i));
        }
        myCloneableList.elements = elements.clone();
        myCloneableList.nameList = copyList;
        return myCloneableList;
    }

    @Override
    public String toString() {
        return "MyCloneable{" +
                "name='" + name + '\'' +
                '}';
    }
}
