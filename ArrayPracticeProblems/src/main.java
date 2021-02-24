public class main {
    public static void main(String[] args) {
        /* Create an array that holds 20 positions, give each index a
        random value between 1-6, then use a for loop to count.
        How many 1's were generated in the array. */

        int[] arr = new int[20];
        int NumberOf1 = 0;
        for(int a = 0; a < arr.length; a++) {
            arr[a] = ((int) (Math.random() * 6) + 1);
            if (arr[a] == 1) {
                NumberOf1 ++;
            }
            System.out.println("value: " +arr[a]);
        }
        System.out.println("Number of 1s: " +NumberOf1);


        System.out.println();
        /*Create another array holds 10 positions, give each index
        a random value between 1 and 100, then find the average
        of all the values in the array */

        int[] arr2 = new int[10];
        int b;
        double total = 0;
        for(b = 0; b < arr2.length; b++){
            arr2[b] = ((int)(Math.random()*100)+1);
            System.out.println("value:" +arr2[b]);
            total = total + arr2[b];
        }
        System.out.println("average: " +(total/arr2.length));

        System.out.println();
        //Take the last array you made and swap 2 different index positions.

        //note: I switched index positions 1 and 5.
        int swap = arr2[1];
        arr2[1] = arr2[5];
        arr2[5] = swap;
        for(b = 0; b < arr2.length; b++){
            System.out.println("value:" +arr2[b]);
        }

        System.out.println();
        //Take the last array you made and completely reverse the order of the array.
        for(b = arr2.length-1; b >= 0; b--){
            System.out.println("reverse:" +arr2[b]);
        }
    }
}