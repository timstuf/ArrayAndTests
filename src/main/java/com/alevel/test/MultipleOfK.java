package com.alevel.test;

public class MultipleOfK
{
    public int[] Multiple(int[]array, int k)
    {
        if(array == null) throw new NullPointerException();
        if(array.length == 0) throw new IllegalStateException();
        if(k==0) throw new IllegalArgumentException();

        int[]prepare = new int[array.length];
        int size = -1;
        for(int i = 0; i<array.length; i++)
            if(array[i]%k == 0) prepare[++size] = array[i];

        int[] result = new int[++size];
        System.arraycopy( prepare, 0, result, 0, result.length);
        return result;
    }
}
