package com.alevel.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MinMaxTest
{
    private MinMax MinMaxInstance;
    @Before
    public void before()
    {
        MinMaxInstance = new MinMax();
    }
    @Test(expected = IllegalStateException.class)
    public void NoElements()
    {
        int[] array = new int[]{};
        int[] result = MinMaxInstance.FindMinAndMax(array);
    }
    @Test(expected = NullPointerException.class)
    public void NullArray()
    {
        int[] array = null;
        int[] result = MinMaxInstance.FindMinAndMax(array);
    }
    @Test
    public void AllSameElements()
    {
        int[] array = new int[]{2,2,2,2};
        int[] expected = new int[]{2,2};
        int[] result = MinMaxInstance.FindMinAndMax(array);
        Assert.assertArrayEquals(expected,result);
    }
    @Test
    public void OneToFiveElements()
    {
        int[] array = new int[]{1,2,3,4,5};
        int[] expected = new int[]{1,5};
        int[] result = MinMaxInstance.FindMinAndMax(array);
        Assert.assertArrayEquals(expected,result);
    }
    @Test
    public void Negative()
    {
        int[] array = new int[]{-1,-2,-3,-4,-5};
        int[] expected = new int[]{-5,-1};
        int[] result = MinMaxInstance.FindMinAndMax(array);
        Assert.assertArrayEquals(expected,result);
    }
}
