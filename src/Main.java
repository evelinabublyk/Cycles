import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number from 1 to 5");
            int task = sc.nextInt();
            if (task < 0){
                System.out.println("ERROR: invalid input!");
            }
            else if (task == 0){
                System.out.println("Program finished");
                break;
            }
            else if (task > 0 && task <= 5){
                switch (task){
                    case 1:
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
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                }

            }
        }
    }
}