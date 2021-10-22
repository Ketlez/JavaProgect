package com.company;

public class Container {
    private int [] arr;
    private int size;
    private int currentSize;
    private int increaseSize;

    Container()
    {
        size = increaseSize = 7;
        currentSize = 0;
        arr = new int[size];
    }

    private void increaseSize ()
    {
        size += increaseSize;
        int [] new_arr = new int[size];
        for (int i = 0; i < size - increaseSize; i++)
        {
            new_arr[i]=arr[i];
        }
        arr = new_arr;
    }


    private void decreaseSize ()
    {
        size -= increaseSize;
        int [] new_arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            new_arr[i]=arr[i];
        }
        arr = new_arr;
    }

    public void add_item (int elem)
    {
        if(currentSize == size)
            increaseSize();
        arr[currentSize]=elem;
        currentSize++;
    }

    public void remove_item (int tm)
    {
        --tm;

        if(tm>=0 && tm<currentSize)
        {
            currentSize--;
            int [] new_arr = new int[size];
            int i = 0, j =0;
            while (i!=currentSize)
            {
                if(j!=tm)
                {
                    new_arr[i] = arr[j];
                    i++;
                }
                j++;
            }
            arr = new_arr;
            if(currentSize<=size-increaseSize) decreaseSize();
        }
        else System.out.println("Item number does not exist!");
    }

    public int get_i_Elem (int i)
    {
        --i;
        int elem =0;
        if(i<0||i>=currentSize)
            System.out.println("Element doesn't exist!");
        elem = arr[i];
        return elem;
    }
    public int getCurrentSize ()
    {
        return currentSize;
    }
    public int getSize ()
    {
        return size;
    }
}
