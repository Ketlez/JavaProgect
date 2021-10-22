package com.company;

public class Main {

    public static void main (String[]args)
    {
        Container arr = new Container();
        System.out.println("Create a 7-item container: ");
        for(int i=0; i<9; i++)
        {
            arr.add_item(i);
            System.out.println("Size:" + arr.getSize()+ " Elem №" +arr.getCurrentSize()+": "+ arr.get_i_Elem(i+1));
        }

        System.out.println("Remove 3 items: ");
        arr.remove_item(1);
        arr.remove_item(1);
        arr.remove_item(1);
        for(int i=0; i<arr.getCurrentSize(); i++) {
            System.out.println("Size:" + arr.getSize() + " Elem №" + (i+1) + ": " + arr.get_i_Elem(i + 1));
        }
        System.out.println("Current item: №" + arr.getCurrentSize()+ ", Container size:" + arr.getSize());
        System.out.println("Current item: №4 = "+ arr.get_i_Elem(4));
        System.out.println();
        System.out.println();
    }
}