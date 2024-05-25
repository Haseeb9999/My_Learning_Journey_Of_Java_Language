// import java.util.Random;
// import java.util.Scanner;

public class Forth_Assignment_Of_Java {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // Random rl = new Random();

        // First Problem
        {
            // Wrong Code
            // int a = 10;
            // if (a=11) {
            // System.out.println("I am 11");
            // } else {
            // System.out.println("I am not 11")
            // }

            // Correct Code
            /*
             * int a = 10;
             * if (a==11) {
             * System.out.println("I am 11");
             * } else {
             * System.out.println("I am not 11");
             * }
             */
        }

        // Second Problem
        {
            /*
             * System.out.print("Enter your Maths Number: ");
             * byte Math = sc.nextByte();
             * System.out.print("Enter your Computer Number: ");
             * byte Computer = sc.nextByte();
             * System.out.print("Enter your Science Number: ");
             * byte Science = sc.nextByte();
             * float Avg = ((Math+ Science+ Computer)/3.0f);
             * System.out.printf("The average of all number is %f\n",Avg);
             * if (Math >= 33 && Computer >=33 && Science >= 33 && Avg >= 40) {
             * System.out.println("You are Passed");
             * } else {
             * System.out.println("You are failed. Better Luck for next time");
             * }
             */
        }

        // Third Problem
        {
            /*
             * System.out.print("Enter Your Salary: ");
             * int Salary = sc.nextInt();
             * int Tax = 0;
             * if (Salary <= 250000) {
             * System.out.println("Your tax amount according to your salary is "+Tax);
             * 
             * }
             * else if (Salary > 250000 && Salary <= 500000) {
             * Tax = ((Salary/100)*5);
             * System.out.println("Your tax amount according to your salary is "+Tax);
             * }
             * else if (Salary > 500000 && Salary <= 1000000) {
             * Tax = ((Salary/100)*20);
             * System.out.println("Your tax amount according to your salary is "+Tax);
             * }
             * else if (Salary > 1000000) {
             * Tax = ((Salary/100)*30);
             * System.out.println("Your tax amount according to your salary is "+Tax);
             * }
             */
        }

        // Forth Problem
        {
            /*
             * System.out.print("Enetr the Day number: ");
             * byte Day = sc.nextByte();
             * switch (Day) {
             * case 1:
             * System.out.println("Monday");
             * break;
             * case 2:
             * System.out.println("Monday");
             * break;
             * case 3:
             * System.out.println("Monday");
             * break;
             * case 4:
             * System.out.println("Monday");
             * break;
             * case 5:
             * System.out.println("Monday");
             * break;
             * case 6:
             * System.out.println("Monday");
             * break;
             * case 7:
             * System.out.println("Monday");
             * break;
             * default:
             * System.out.
             * println("Bro Only Seven Days in a week Please ask a valid Question");
             * break;
             * }
             */
        }

        // Fifth Problem
        {
            /*
             * System.out.println("Enter the year: ");
             * int year = sc.nextInt();
             * int Result = (year % 4);
             * if (Result == 0) {
             * System.out.printf("Yes %d is a leap year",year);
             * } else {
             * System.out.printf("No %d is not leap year",year);
             * }
             */
        }

        // Sixth problem
        // --------Stone Paper Sisser Game--------
        // {
        //     byte yw = 0;
        //     byte yl = 0;
        //     byte ui;
        //     int m = 1;
        //     do {
        //         System.out.println("--------Stone Paper Sisser Game--------\n");
        //         System.out.printf("Match %d\n", m++);
        //         System.out.println("(1) Stone");
        //         System.out.println("(2) Paper");
        //         System.out.println("(3) Scissor\n");
        //         System.out.print("Enter your Choice: ");
        //         ui = sc.nextByte();
        //         if (ui == 1) { System.out.println("\nYour Choice is Stone");
        //         } else if (ui == 2) { System.out.println("\nYour Choice is Paper");
        //         } else if (ui == 3) { System.out.println("\nYour Choice is Scissor");
        //         } else { System.out.printf("\n There is no option for this number %d You fool", ui); }
        //         int word_num = rl.nextInt(3) + 1;
        //         { if (word_num == 1) { String cc = "Computer Choose Stone\n";
        //                 System.out.println(cc);
        //             } else if (word_num == 2) { String cc = "Computer Choose Paper\n";
        //                 System.out.println(cc);
        //             } else if (word_num == 3) { String cc = "Computer Choose Scissor\n";
        //                 System.out.println(cc);
        //             } else { System.out.println("Please Enter a valid number\n"); } }
        //         { if (word_num == ui) { System.out.println("Both are same");
        //             } else if (word_num == 1 && ui == 2) { System.out.println("You Win");
        //                 yw++; 
        //                 System.out.println("Your Score: " + yw);
        //             } else if (word_num == 1 && ui == 3) { System.out.println("You lose");
        //                 yl++;
        //                 System.out.println("Opponent Score: " + yl);
        //             } else if (word_num == 2 && ui == 1) { System.out.println("You lose");
        //                 yl++;
        //                 System.out.println("Opponent Score: " + yl);
        //             } else if (word_num == 2 && ui == 3) { System.out.println("You Win");
        //                 yw++;
        //                 System.out.println("Your Score: " + yw);
        //             } else if (word_num == 3 && ui == 1) {
        //                 System.out.println("You Win");
        //                 yw++;
        //                 System.out.println("Your Score: " + yw);
        //             } else if (word_num == 3 && ui == 2) {
        //                 System.out.println("You lose");
        //                 yl++;
        //                 System.out.println("Opponent Score: " + yl);
        //             } else {
        //                 System.out.println("Enter a valid Number");
        //             }
        //         }
        //     } while (yl < 10 && yw < 10);
        // }

        // Seventh Problem
        {
            /*
             * System.out.print("Enter a Website Domain Name: ");
             * String Web = sc.nextLine();
             * Web = Web.replace(" ", "");
             * Web = Web.toLowerCase();
             * if (Web.endsWith(".com")) {
             * System.out.
             * printf("%s This website Work on international level Because of its domain",
             * Web);
             * } else if (Web.endsWith(".org")) {
             * System.out.printf("%s This website is belongs any organision",Web);
             * } else if (Web.endsWith(".pk")) {
             * System.out.printf("%s This Website is belongs to Pakistan",Web);
             * } else if (Web.endsWith(".in")) {
             * System.out.printf("%s This website is belongs to India",Web);
             * } else {
             * System.out.println("ooo bhai ya kia daal dia");
             * }
             */
        }
    }
}