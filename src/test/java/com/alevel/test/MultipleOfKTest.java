package com.alevel.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
public class MultipleOfKTest
{
    private MultipleOfK MultipleOfKInstance;
    @Before
    public void before()
    {
        MultipleOfKInstance = new MultipleOfK();
    }
    @Test(expected = IllegalStateException.class)
    public void NoElements()
    {
        int[] array = new int[]{};
        int[] result = MultipleOfKInstance.Multiple(array,4);
    }
    @Test(expected = NullPointerException.class)
    public void NullArray()
    {
        int[] array = null;
        int[] result = MultipleOfKInstance.Multiple(array,3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void KIsZero()
    {
        int[] array = new int[2];
        int[] result = MultipleOfKInstance.Multiple(array,0);
    }
    @Test
    public void NoMultiples()
    {
        int[] array = new int[]{1,2,3,4};
        int[] expected = new int[]{};
        int[] result = MultipleOfKInstance.Multiple(array,5);
        assertArrayEquals(expected,result);
    }
    @Test
    public void AllMultiples()
    {
        int[] array = new int[]{1,2,3,4,5};
        int[] expected = new int[]{1,2,3,4,5};
        int[] result = MultipleOfKInstance.Multiple(array,1);
        assertArrayEquals(expected,result);
    }
    @Test
    public void AllNegativeMultiples()
    {
        int[] array = new int[]{-1,-2,-3,-4,-5};
        int[] expected = new int[]{-1,-2,-3,-4,-5};
        int[] result = MultipleOfKInstance.Multiple(array,1);
        assertArrayEquals(expected,result);
    }
    @Test
    public void AllKindsOfNumbers()
    {
        int[] array = new int[]{-1, 0 , 3,-4, 6};
        int[] expected = new int[]{0, -4, 6};
        int[] result = MultipleOfKInstance.Multiple(array,2);
        assertArrayEquals(expected,result);
    }
}
