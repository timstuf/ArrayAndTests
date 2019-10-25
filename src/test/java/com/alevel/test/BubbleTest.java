package com.alevel.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
public class BubbleTest
{
    private Bubble BubbleInstance;
    @Before
    public void before()
    {
        BubbleInstance = new Bubble();
    }
    @Test(expected = IllegalStateException.class)
    public void NoElements()
    {
        int[] array = new int[]{};
        int[] result = BubbleInstance.BubbleSort(array);
    }
    @Test(expected = NullPointerException.class)
    public void NullArray()
    {
        int[] array = null;
        int[] result = BubbleInstance.BubbleSort(array);
    }

    @Test
    public void AlreadySorted()
    {
        int[] array = new int[]{1,2,3,4,5};
        int[] result = BubbleInstance.BubbleSort(array);
        assertArrayEquals(array,result);
    }
    @Test
    public void Negative()
    {
        int[] array = new int[]{-1,-2,-3,-4,-5};
        int[] expected = new int[]{-5,-4,-3,-2,-1};
        int[] result = BubbleInstance.BubbleSort(array);
        assertArrayEquals(expected,result);
    }
    @Test
    public void AllKindsOfNumbers()
    {
        int[] array = new int[]{-1, 0, 100, -4, -0};
        int[] expected = new int[]{-4, -1, 0, 0, 100};
        int[] result = BubbleInstance.BubbleSort(array);
        assertArrayEquals(expected,result);
    }
}
