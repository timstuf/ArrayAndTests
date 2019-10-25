package com.alevel.test;

public class Bubble
{
    public int[] BubbleSort(int[]array)
    {
        if(array == null) throw new NullPointerException();
        if(array.length == 0) throw new IllegalStateException();

        for(int i = 0; i< array.length-1; i++)
        {
            for(int j = 0; j<array.length-1-i; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
