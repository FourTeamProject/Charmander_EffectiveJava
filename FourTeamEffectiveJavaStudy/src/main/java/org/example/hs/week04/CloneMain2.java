package org.example.hs.week04;

public class CloneMain2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyCloneableList myCloneableList = new MyCloneableList("richard");
        myCloneableList.addName("jun");

        MyCloneableList cloneMyCloneableList = (MyCloneableList) myCloneableList.clone();
        cloneMyCloneableList.addName("won");

        int myCloneableListSize = myCloneableList.getNameList().size();
        int cloneMyCloneableListSize = cloneMyCloneableList.getNameList().size();


        System.out.println(cloneMyCloneableListSize);
        System.out.println(cloneMyCloneableList.getNameList().get(cloneMyCloneableListSize-1));

        System.out.println(myCloneableListSize);
        System.out.println(myCloneableList.getNameList().get(myCloneableListSize-1));

        //배열
        myCloneableList.printArr();
        cloneMyCloneableList.printArr();
    }
}
