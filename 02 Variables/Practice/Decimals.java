public class Decimals {
    public static void main(String[] args) {
        // 'Doubles' can go up to 15 decimal places
        double percentage = 73.5;
        System.out.println(percentage + "% of percentages are made up!");

        /* 
            Never use int for calculations
            Java will cut off any decimal places
        */
       int dividend = 11;
       int divisor = 2;

        // answer should be 5.5...
       System.out.println(dividend / divisor);

        // store one of the data types as a double
        double wallet = 20;
        int people = 3;

        // result will be a double resulting in decimals being included
        System.out.println(wallet / people);
    }
}
