//NAME: Abhash Shrestha
//ASU_ID: 1214683132
//CLASS_ID: 112
//ASSIGNMENT: #2
//DESC: Class using junit to test SimpleList class

package cse360assign2;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SimpleListTest {

    @Test
    public void testAdd() {
        int[] expected = new int[10];   //expected array
        expected[0] = 4;
        expected[1] = 5;

        SimpleList list = new SimpleList();
        list.add(5);
        list.add(4);
        assertEquals(Arrays.toString(expected), list.toString());
    }

    @Test
    public void testAddOverflow(){
        int[] expected = new int[15];
        expected[0] = 0;
        expected[1] = 1;
        expected[2] = 2;
        expected[3] = 3;
        expected[4] = 4;
        expected[5] = 5;
        expected[6] = 6;
        expected[7] = 7;
        expected[8] = 8;
        expected[9] = 9;
        expected[10] = 10;
        expected[11] = 11;

        SimpleList list = new SimpleList();
        list.add(11);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        assertEquals(Arrays.toString(expected), list.toString());
    }

    @Test
    public void testRemove() {

        SimpleList list = new SimpleList();
        list.add(1);
        list.remove(1);

        assertEquals("[0, 0, 0, 0, 0, 0, 0]", list.toString());   //test removing an input

        list.remove(10);
        assertEquals("[0, 0, 0, 0, 0]", list.toString());   //test input not found
    }

    @Test
    public void testRemoveReduce(){
        int[] expected = new int[7];
        expected[0] = 0;
        expected[1] = 1;
        expected[2] = 2;
        expected[3] = 3;
        expected[4] = 4;
        expected[5] = 5;
        expected[6] = 6;

        SimpleList list = new SimpleList();
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        list.remove(9);
        list.remove(8);
        list.remove(7);
        assertEquals(Arrays.toString(expected), list.toString());   //test input not found
    }

    @Test
    public void testCount() {
        final int EXPECTED = 2;

        SimpleList list = new SimpleList();
        list.add(5);
        list.add(7);

        assertEquals(EXPECTED, list.count());
    }

    @Test
    public void testToString() {
        int[] expected = new int[10];
        SimpleList list = new SimpleList();

        assertEquals(Arrays.toString(expected), list.toString());
    }

    @Test
    public void testSearch() {
        final int EXPECTED = 1;

        SimpleList list = new SimpleList();
        list.add(1);
        list.add(2);

        assertEquals(EXPECTED, list.search(1));         //test found input
        assertEquals(-1, list.search(4));      //test input not found
    }

    @Test
    public void testAppend() {
        int[] expected = new int[15];
        expected[0] = 0;
        expected[1] = 1;
        expected[2] = 2;
        expected[3] = 3;
        expected[4] = 4;
        expected[5] = 5;
        expected[6] = 6;
        expected[7] = 7;
        expected[8] = 8;
        expected[9] = 9;
        expected[10] = 10;
        expected[11] = 11;

        SimpleList list = new SimpleList();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);
        list.append(11);

        assertEquals(Arrays.toString(expected), list.toString());
    }

    @Test
    public void testFirst(){
        SimpleList list = new SimpleList();
        list.add(1);
        int firstValue = list.first();
        int expected = 1;
        assertEquals(firstValue, expected);
    }

    @Test
    public void testFirstEmpty(){
        SimpleList list = new SimpleList();
        int firstValue = list.first();
        int expected = -1;
        assertEquals(firstValue, expected);
    }

    @Test
    public void testLast(){
        SimpleList list = new SimpleList();
        list.append(1);
        list.append(2);
        int lastValue = list.last();
        int expected = 2;
        assertEquals(expected, lastValue);
    }

    @Test
    public void testSize(){
        SimpleList list = new SimpleList();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);
        list.append(11);

        int sizeValue = list.size();
        int expected = 15;
        assertEquals(expected, sizeValue);
    }
}