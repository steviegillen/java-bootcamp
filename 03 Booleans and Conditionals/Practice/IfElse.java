public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if (chemistryGrade > biologyGrade) {
            System.out.println("Yes, you did. Congrats!");
        } else {
            System.out.println("No, You did not!");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if(sales > costs) {
            System.out.println("Yes, you made profit");
        } else {
            System.out.println("No, you lost money");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if(temperature < targetTemperature) {
            System.out.println("It is. Maybe put the heating on");
        } else {
            System.out.println("No. The temperature is fine!");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if(currentSpeed < speedLimit){
            System.out.println("You are driving safely");
        } else {
            System.out.println("You are over the speed limit. Slow down!");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if(age >= retirementAge) {
            System.out.println("Time to put the feet up and relax");
        } else {
            System.out.println("Not quite yet. Back to work you go!");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if( myGrade == bestGrade) {
            System.out.println("You earned top marks!");
        } else {
            System.out.println("Not this time, but work hard and you will reach your goals!");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if(word.equals(secondWord)){
            System.out.println("Both words are the same");
        } else {
            System.out.println("Both words are different");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if(!thirdWord.equals(fourthWord)) {
            System.out.println("Yes, both words are different.");
        } else {
            System.out.println("No, both words are the same");
        }
    }
}
