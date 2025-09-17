import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number from 1 to 5");
            int task = sc.nextInt();
            if (task < 0 && task > 5){
                System.out.println("ERROR: invalid input!");
            }
            else if (task == 0){
                System.out.println("Program finished");
                break;
            }
            else if (task > 0 && task <= 5){
                switch (task) {
                    case 1: {
                        System.out.println("What is your goal-distance in km?");
                        int goal = sc.nextInt();

                        if (goal < 0) {
                            System.out.println("ERROR: invalid input!");
                            break;
                        }

                        System.out.println("How many kms can you ride on a first day");
                        int firstDay = sc.nextInt();

                        if (firstDay < 0) {
                            System.out.println("ERROR: invalid input!");
                            break;
                        }

                        int days = 0;
                        double current = firstDay;

                        while (current < goal) {
                            current += current * 0.05;
                            days++;
                        }
                        System.out.println("You need " + days + " days to achieve your goal-distance");
                        break;
                    }

                    case 2: {
                        int initialDeposit = 100;
                        double mykola = initialDeposit;
                        double andrii = initialDeposit;

                        int months = 0;

                        while (andrii <= mykola) {
                            mykola += initialDeposit * 0.10;
                            andrii *= 1.05;
                            months++;
                        }

                        int years = months / 12;
                        int monthsLeft = months % 12;

                        System.out.println("Andrii's deposit will be bigger than Mykola's in " + years + " years " + monthsLeft + " months");
                        break;
                    }

                    case 3:
                    {
                        int count = 0;

                        for (int a = 1; a <= 9; a++) {
                            for (int b = 1; b <= 9; b++) {
                                for (int c = 1; c <= 9; c++) {
                                    if (a != b && a != c && b != c) {
                                        System.out.println(" " + a + b + c);
                                        count++;
                                    }
                                }
                            }
                        }

                        int seconds = count * 3;
                        int minutes = seconds / 60;
                        int secondsLeft = seconds % 60;

                        System.out.println("The amount of total combinations " + count);
                        System.out.println("In worst-case scenario it will take you " + minutes + " minutes " + secondsLeft + " seconds to open");
                        break;
                    }

                    case 4:
                    {
                        System.out.println("Enter the amount of numbers");
                        int amount = sc.nextInt();

                        if (amount < 0)
                        {
                            System.out.println("ERROR: invalid input!");
                        }

                        int n1 = 1;
                        int n2 = 1;

                        for (int i = 0; i < amount; i++) {
                                    System.out.print(n1 + " ");
                                    int t = n1;// t = 0
                                    n1 = n2;// n1 = 1
                                    n2 = t + n2;// n2 = 0 + 1
                                }
                        break;
                    }

                    case 5:
                    {
                        System.out.println("Enter your number");
                        int number = sc.nextInt();

                        if (number < 0)
                        {
                            System.out.println("ERROR: invalid input!");
                        }

                        int n1 = 2;
                        int n2 = 1;

                        while (n1 < number)
                        {
                            int i = 0;
                            i++;
                            System.out.print(n1 + " ");
                            int t = n1;// t = 0
                            n1 = n2;// n1 = 1
                            n2 = t + n2;// n2 = 0 + 1
                        }
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }
}