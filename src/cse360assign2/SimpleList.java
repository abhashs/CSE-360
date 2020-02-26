//NAME: Abhash Shrestha
//ASU_ID: 1214683132
//CLASS_ID: 112
//ASSIGNMENT: #2
//DESC: Class to insert, remove, and read inputs in an array.
//      Can also search for entries and tally the number of entries.

package cse360assign2;

import java.util.Arrays;

/**
 * Initializes an int array and counter for array. Holds methods for
 * inserting, removing, search, counting, and printing array elements.
 * Has no parameters.
 */
public class SimpleList {

    private int[] list;
    private int count;

    public SimpleList(){
        list = new int[10];
        count = 0;
    }


    /**
     * Add input to beginning of array, and push back elements.
     * When array size is reached, size is increased by 50%
     * @param input the number to be added to the array
     */
    public void add(int input){
        if (count == list.length) {
            int newSize = (int)(list.length*1.5);
            int[] temp = new int[newSize];
            for(int index = 0; index < count; index++){
                temp[index] = list[index];
            }
            list = temp;
        }
        for (int index = list.length - 1; index > 0; index--) {
            list[index] = list[index - 1];
        }
        list[0] = input;
        count++;

    }


    /**
     * Search and remove input from array. If an element is removed,
     * the rest of the array is brought up in index, otherwise the
     * array remains the same.
     * @param input the number to be removed
     */
    public void remove(int input){
        int[] temp = list;

        //linear search for input
        for(int index = 0; index < list.length; index++){

            //if found, bring rest of elements forward
            if(list[index] == input){
                for(int index2 = index; index2 < list.length; index2++){
                    if((index2 + 1) < list.length){
                        temp[index2] = list[index2 + 1];
                    }
                }
                count--;
            }
        }
        list = temp;

        if(count <= (int)(list.length * .75)){
            int newSize = (int)(list.length * .75);
            temp = new int[newSize];
            for(int index = 0; index < newSize; index++){
                temp[index] = list[index];
            }
            list = temp;
        }
    }


    /**
     * @return returns count, the number of added elements
     */
    int count(){
        return count;
    }


    /**
     * Uses Arrays package to turn list into a String.
     * Needs Override to override built-in toString
     * @return returns list array as a String
     */
    @Override
    public String toString() {
        return Arrays.toString(list);
    }


    /**
     * @param input the number to be found
     * @return  returns the index position of the number, or -1 if not found
     */
    public int search(int input){
        int result = -1;

        //linear search for input
        for(int index = 0; index < list.length; index++){
            if(list[index] == input){
                result = index;
            }
        }
        return result;
    }
}
