public class Main {
    public static void main(String args[]){
        //Expressions Assignment
        System.out.println("Expressions Assignment:");
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */

        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        System.out.println(5 + 10 / 2 + 4 / 3);
        System.out.println(5 + 5 + 1);
        System.out.println(11);

        //Expression 2
        System.out.println();

        System.out.println(23%4 + (18 - 3 / 2));
        System.out.println(23%4 + (18 - 1));
        System.out.println(23%4 + 17);
        System.out.println(3 + 17);
        System.out.println(20);

        //Expression 3
        System.out.println();

        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        System.out.println(3 + 81/5.0);
        System.out.println(3 + 16.2);
        System.out.println(19.2);

        //Expression 4
        System.out.println();

        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (9 / 3));
        System.out.println(1 - 8 + Math.pow(2,3) / 8 + 3);
        System.out.println(1 - 8 + 8 / 8 + 3.0);
        System.out.println(1 - 8 + 1 + 3.0);
        System.out.println(-7 + 1 + 3.0);
        System.out.println(-3.0);

        //Expression 5
        System.out.println();

        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(((7+3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println((10 * Math.sin(45) + 2) - Math.pow(5, 3));
        System.out.println((10 * Math.sin(45) + 2) - 125);
        System.out.println(-114.49096475465882);

        //Practice
        System.out.println();
        System.out.println("Practice:");

        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );


        // Problem 2
        System.out.println();
        /*Write a program that creates three variables: an int, a double, and a String.
        Put the value 113 into the first variable, the value 2.71828 into the second, and the value "Computer Science"
        into the third. It does not matter what you call the variables... this time.
        Then, display the values of these three variables on the screen, one per line.
         */

        int room_number;
        double e = 2.718128;
        room_number = 113;
        String cs = "Computer Science";
        System.out.println("This is room #" + room_number);
        System.out.println("e is close to " + e);
        System.out.println("I am learning a bit about " + cs);


        //Your Schedule
        System.out.println();
        /*Use several variables to store the names of your classes and their teachers.
        Then, display a nice little table displaying your schedule. Just FYI, my column
        of courses has a width of 26 characters, and the teacher column has a width of 15.
        The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.
         */

        String table_horizontal = "+--------------------------------------------------------------+";
        String blocks = "                                 Class |         Teacher";
        String block1 = "                           English III |       Ms. Lepan";
        String block2 = "                           Precalculus |     Mrs. Gideon";
        String block3 = "                          Music Theory |       Mr. Davis";
        String block4 = "                         Biotechnology |      Ms. Palmer";
        String block5 = "            Principles of Technology I |      Ms. Garcia";
        String block6 = "                              Latin II |    Mrs. Barnett";
        String block7 = "                         AP US History | Ms. Johannessen";
        String block8 = " Business Computer Information Systems |       Mr. James";

        int index = blocks.indexOf("|");

        String class1 = block1.substring(0, index + 1);
        String class2 = block2.substring(0, index + 1);
        String class3 = block3.substring(0, index + 1);
        String class4 = block4.substring(0, index + 1);
        String class5 = block5.substring(0, index + 1);
        String class6 = block6.substring(0, index + 1);
        String class7 = block7.substring(0, index + 1);
        String class8 = block8.substring(0, index + 1);

        String name1 = block1.substring(index + 1);
        String name2 = block2.substring(index + 1);
        String name3 = block3.substring(index + 1);
        String name4 = block4.substring(index + 1);
        String name5 = block5.substring(index + 1);
        String name6 = block6.substring(index + 1);
        String name7 = block7.substring(index + 1);
        String name8 = block8.substring(index + 1);

        System.out.println(table_horizontal);
        System.out.println("| # | " + blocks +" |");
        System.out.println(table_horizontal);
        System.out.println("| 1 | " + class1 + name1 +" |");
        System.out.println("| 2 | " + class2 + name2 +" |");
        System.out.println("| 3 | " + class3 + name3 +" |");
        System.out.println("| 4 | " + class4 + name4 +" |");
        System.out.println("| 5 | " + class5 + name5 +" |");
        System.out.println("| 6 | " + class6 + name6 +" |");
        System.out.println("| 7 | " + class7 + name7 +" |");
        System.out.println("| 8 | " + class8 + name8 +" |");
        System.out.println(table_horizontal);
    }
}
