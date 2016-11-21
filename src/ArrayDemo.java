/**
 * Created by NicholasTurner on 11/21/16.
 */
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        //two line
//        int numberOfElementsOnArray = 10;
//        int[] arrayOfInts;
//        arrayOfInts = new int[numberOfElementsOnArray];
//
//        //one line
//        int[] arrayOfIntegers = new int[10];
//
//        boolean[] arrayOfBooleans = new boolean[2];
//        System.out.println(arrayOfBooleans[0]);
//        System.out.println(arrayOfBooleans[1]);
//
//        //shortcut syntax
//        String[] arrayOfStrings = {"Clean Code", "Head First Java", "Pragmatic Programmer"};
//
//        for(String title : arrayOfStrings) {
//            System.out.println(title);
//        }
//
//
//        double[] prices = {1.99, 2.99, 3.85, 1.95, 14999.99};
//        //shortcut ^
//        /*double[] prices;
//        prices = new double[5];
//        prices[0]= 1.99;
//        prices[1]= 2.99;
//        prices[2]= 3.85;
//        prices[3]= 1.95;
//        prices[4]= 14999.99;*/
//
//        double sum = 0;
//        double average;
//
//        for(int i = 0; i < prices.length; i++){
//            sum += prices[i];
//        }
//
//        for(double price : prices){
//            sum += price;
//        }
//        average = sum / prices.length;
//        System.out.println("Average price is " + average);
//
//        int[] array1 = {1,2,3};
//        int[] array2 = Arrays.copyOf(array1,(array1.length - 1));
//        boolean areSame;
//        areSame = Arrays.equals(array1, array2);
//        System.out.println("it is "+ areSame + " that the arrays are the same type and have the same value");
//
//         SORT/BINARY SEARCH
//        int[] array1 = {3,3,2,1};
//        Arrays.sort(array1);
//        int indexOfTwo;
//
//        indexOfTwo = Arrays.binarySearch(array1,2);
//        System.out.println("The index of the value is " + indexOfTwo);
        //REFERENCING AN ARRAY, NOT MAKING A COPY, its a reference to the SAME array
        int[] array1 = {3,3,2,1};
        //int[] array2 = array1; //not a copy, a reference
        int[] array2 = Arrays.copyOf(array1, array1.length); //this is a copy

        array2[0] = 99;
        array2[1] = 98;
        array2[2] = 97;
        array2[3] = 96;

        System.out.println("array 2 values: ");
        for(int number : array2) {
            System.out.println(number);
        }

    }
}
