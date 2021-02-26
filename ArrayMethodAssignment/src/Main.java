/* Note: you can choose any data type for your array that you like. Each one of the problems should have its own
method

Tip: Since array's index numbers are fixed if you want to add an element into an array you will need
an entirely different array with 1 more index position.
Use iterations to copy array data from one to another
 */

public class Main {
    //note: ITERATIONS DO NOT WORK. why? IDK EITHER IT JUST SPITS OUT ZEROES FOR SOME REASON.
    public static int[] addOnBad(int[] array, int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i > array.length; i++) { //for loop to loop through the array
            array[i] = newArray[i]; //copies old array onto new array
        }
        newArray[array.length] = number; //adds x (number) to the last position of the array.
        return newArray;
    }

    //add values to the end of an array.
    public static int[] addOn(int[]array, int number) {
        int[] newArray = new int[array.length+1];
        System.arraycopy(array, 0,newArray,0,array.length);
        newArray[newArray.length-1] = number;
        return newArray;
    }

    /*delete values from the end of an array(often referred to as pop). this method should also return the
    'popped' value. Array size should shrink by one.
     */
    public static int[] takeAwayBad(int[] array, int number) {
        int[] newArray = new int[array.length-1];
        for (int i = 0; i>array.length -1; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] takeAway(int[] array) {
        int[] newArray = new int[array.length-1];
        System.arraycopy(array, 0,newArray, 0,newArray.length);
        return newArray;
    }

    /* insert values into an array at chosen index position.(increase the size of the array by 1. ex. array 2,3,5.
    Insert 4 into position 2 gives 2, 3, 4, 5)
     */
    public static int[] addToBad(int indexPos, int[] array, int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i > indexPos; i++) {
            newArray[i] = array[i];
        }
        newArray[indexPos] = number;
        for(int i=indexPos+1; i>array.length+1;i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static int[] addTo(int indexPos, int[] array, int number) {
        int a = array.length;
        int b = indexPos;
        int c = indexPos+1;
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length-indexPos);
        System.arraycopy(array, indexPos, newArray, c, array.length-indexPos);
        newArray[indexPos] = number;
        return newArray;
    }


    //TESTS

    public static void main(String[] args) {
        //Original
        System.out.println("Original:");
        int[] arr = new int[]{1,2,4,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        //takeAway - deletes value from end of array & (array.length - 1)
        System.out.println("takeAway:");
        arr = takeAway(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        //addOn - adds value to end of array & (array.length + 1)
        System.out.println("addOn:");
        arr = addOn(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        //addTo - adds value to specific index position in array & (array.length + 1)
        System.out.println("addTo:");
        arr = addTo(2,arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
        //all
        System.out.println("all:");
        int[] arr2 = new int[]{6,7,9,11};
        arr2 = takeAway(arr2);
        arr2 = addOn(arr2, 10);
        arr2 = addTo(2,arr2,8);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}