import java.util.Scanner;
public class First_Assignment_Of_Java {

    public static void main(String[] args) {
        // Initializing the library
        Scanner sc = new Scanner(System.in);

        // Percentage Calculator
        // {
        //     // First Taking a name of user
        //     {
        //         System.out.println("What is your name?");
        //         String name = sc.nextLine();
        //         System.out.println("Hello! "+name+" Have a good Day");
        //     }
        //     // Taking a marks of English from user
        //     System.out.print("\nEnter your English mark: ");
        //     float English = sc.nextFloat();
        //     System.out.print("\nEnter your Maths mark: ");
        //     float Maths = sc.nextFloat();
        //     System.out.print("\nEnter your Physics mark: ");
        //     float Physics = sc.nextFloat();
        //     System.out.print("\nEnter your Programming mark: ");
        //     float Programming = sc.nextFloat();
        //     System.out.print("\nEnter your ICT mark: ");
        //     float ICT = sc.nextFloat();
        //     float ObtainMarks = English + Maths + Physics + Programming + ICT;
        //     System.out.print("\nEnter the Total marks: ");
        //     float TotalMarks = sc.nextFloat();
        //     float Percentage = (ObtainMarks/TotalMarks)*100;
        //     System.out.println("\nThe Obtain Marks: "+ObtainMarks+"\nThe Percentage: "+Percentage+" %");
        // }

        // Kilo Meters Into Miles Calculator
        {
            System.out.println("KMs To Mile");
            // System.out.println("Enter the KMs You want to convert into Miles");
            // float KMs = sc.nextFloat();
            Float KMs = 9.8f;
            float Miles = KMs / 1.6f;
            System.out.println("You entered a value "+KMs+" KM\nYour Miles here "+ Miles+" Miles");
        }

        // Number Checker Its True And False
        // {
        //     System.out.println("Enter your Number: ");
        //     System.out.println(sc.hasNextFloat());
        // }

        // {
        //     System.out.print("Enter a marks of PF: ");
        //     Float PF = sc.nextFloat();
        //     System.out.print("Enter a marks of OOP: ");
        //     Float OOP = sc.nextFloat();
        //     float result = ((PF+OOP)/200)*100;
        //     System.out.println("Your marks of PF is = "+PF+"\nYour marks of OOP is = "+OOP+"\nThis is your Result = "+result);
        // }
    }
}