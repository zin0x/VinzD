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
            System.out.println("value:" +arr[a]);
        }
        System.out.println("Number of 1s:" +NumberOf1);


        System.out.println();
        /*Create another array holds 10 positions, give each index
        a random value between 1 and 100, then find the average
        of all the values in the array */

        int[] arr2 = new int[10];
        int b;
        int c;
        int total;
        for(b = 0; b < arr2.length; b++){
            arr2[b] = ((int)(Math.random()*100)+1);
            System.out.println("value:" +arr2[b]);
            total = Math.addExact(arr2[b], arr2[b]);
            int average = total;
            System.out.println(average);
        }

        System.out.println();
        //Take the last array you made and swap 2 different index positions.


        System.out.println();
        //Take the last array you made and completely reverse the order of the array.

    }
}