package com.calci.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calci.main.calciDoubleImpl;
import com.calci.main.calciIntegerImpl;
import com.calci.main.calciStringImpl;
import com.calci.main.calculatorInterface;

import org.junit.Assert;

public class AddableTest {

    @Test
    public void testIntegerAddition() {
    	calculatorInterface<Integer> integerAddable = new calciIntegerImpl();
        int result = integerAddable.add(5, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testDoubleAddition() {
    	calculatorInterface<Double> doubleAddable = new calciDoubleImpl();
        double result = doubleAddable.add(2.5, 3.7);
        Assert.assertEquals(6.2, result, 0.0001);
    }

    @Test
    public void testStringConcatenation() {
    	calculatorInterface<String> stringAddable = new calciStringImpl();
        String result = stringAddable.add("Hello, ", "World!");
        Assert.assertEquals("Hello, World!", result);
    }
}


