package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld()
    {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __" );
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println( "      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char letter = 'Z';
        int NRandLE = 0xface;
        int Number = 012;
        long l = 80L;
        float f = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d2 = 99.9;
        int Int = (int) letter;
        int Int2 = (int) l;
        int int3 = (int) f;
        int int4 = (int) f2;
        int int5 = (int) d1;
        int int6 = (int) d2;
        int sum= NRandLE + Number + Int + Int2 + int3 + int4 +int5 + int6;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int sum = (number1 + number2);
        System.out.println(sum);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int NrOne = scan.nextInt();
        System.out.print("y: ");
        int NrTwo = scan.nextInt();
        System.out.println("After Swap:");
        System.out.println("x: " + NrTwo);
        System.out.println("y: " + NrOne);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.out.print("n2: ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }


    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int annualRevenue = scan.nextInt();


        if ((annualRevenue < 0) || (annualRevenue >= 100000)) {
            System.out.println("Invalid Revenue");
        } else if ((0 <= annualRevenue) && (annualRevenue < 20000)) {
            System.out.println("Poor Sales Revenue");
        } else if ((20000 <= annualRevenue) && (annualRevenue < 50000)) {
            System.out.println("Average Sales Revenue");
        } else if ((50000 <= annualRevenue) && (annualRevenue < 80000)) {
            System.out.println("Good Sales Revenue");
        } else if ((80000 <= annualRevenue) && (annualRevenue < 100000)) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int ComissionRate = scan.nextInt();

        switch (ComissionRate) {
            case 1:
                ComissionRate = 1;
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                ComissionRate = 2;
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                ComissionRate = 3;
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                ComissionRate = 4;
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();

        if (year % 4 != 0) {
            System.out.println("Not a Leapyear");
        } else if (year % 100 != 0) {
            System.out.println("Leapyear");
        } else if (year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number");
        int number = scan.nextInt();

        {
            int NR1 = number % 10;
            int NR2 = (number / 10) %10;
            int NR3 = (number / 100) %10;
            int NR = (NR1 * 100) + (NR2* 10) + NR3;

            System.out.println(NR);

        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}