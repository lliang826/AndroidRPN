package com.example.rpnandroid;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import android.app.Activity;
import android.widget.TextView;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private TextView display;

    @Before
    public void setUp() {
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}