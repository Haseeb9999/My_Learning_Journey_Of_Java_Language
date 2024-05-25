import java.util.Scanner;

class Employee {
    public void ID(int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Id: ");
        a = sc.nextInt();
        System.out.println("Ok ID is  "+a);
    }
    public void Name(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        a = sc.nextLine();
        System.out.println("Ok so \""+a+"\" How are you!");
    }

    public void getsalary(int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        a = sc.nextInt();
        System.out.println("Ok you entered salary "+a);
    }

    public void getdetails(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some details related you: ");
        a = sc.nextLine();
        System.out.println("Details:\n"+a);
    }

    // public void prde(){
    //     System.out.println("My ID is: "+id);
    //     // System.out.println("My Name is: "+Name);
    // }
}

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee Sunny = new Employee();
        Employee Anees = new Employee();
        Employee Froos = new Employee();
        
        {
            // Sunny.id = 130;
            // System.out.println(Sunny.id);
            // Sunny.Name = "Muhammad Haseeb Khalid";
            // System.out.println(Sunny.Name);
        }
        
        {
            // Anees.id = 134;
            // Anees.Name = "Anees hassan";
            // Anees.prde();
        }
        
        {
            // Froos.id = 110;
            // Froos.Name = "froos qrashi";
            // Froos.prde();
        }

        {
            Froos.ID(0);
            Froos.Name(null);
            Froos.getsalary(0);
            Froos.getdetails(null);
        }
    }
}
