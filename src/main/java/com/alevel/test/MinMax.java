package com.alevel.test;

public class MinMax
{
    public int[] FindMinAndMax(int[] array)
    {
        if(array == null) throw new NullPointerException();
        if(array.length == 0) throw new IllegalStateException();

        int min,max;
        int result[] = new int[2];

        min = max = array[0];
        for(int i = 1; i<array.length; i++)
        {
            if(array[i]<min) min = array[i];
            if(array[i]>max) max = array[i];
        }
        result[0] = min; result[1] = max;
        return result;
    }
}
