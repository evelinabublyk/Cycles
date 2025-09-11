import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number from 1 to 5");
            int task = sc.nextInt();

            if (task == 0){
                System.out.println("Program finished");
                break;
            }
            else if (task > 0 && task <= 5){
                switch (task){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                }

            }
        }
    }
}