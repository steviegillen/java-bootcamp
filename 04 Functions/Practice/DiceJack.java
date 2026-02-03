import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three numbers between 1 - 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(lessThanOne(num1, num2, num3) || moreThanSix(num1, num2, num3)){
            System.out.println("You entered number(s) outside the valid range!");
            System.exit(0);
        }

        int totalNum = num1 + num2 + num3;
        int totalDice = roll1 + roll2 + roll3;

        System.out.println("Player Score: " + totalNum);
        System.out.println("Dice Score: " + totalDice);

        if (userWon(totalNum, totalDice)) {
            System.out.println("Player Won!");
        } else {
            System.out.println("Player Lost!");
        }

        scan.close();
    }
    
    public static int rollDice() {
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }

    public static boolean lessThanOne(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean moreThanSix(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
    }
}
