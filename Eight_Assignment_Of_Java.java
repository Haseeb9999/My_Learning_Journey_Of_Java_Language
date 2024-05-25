import java.util.Scanner;
class Employee1 {
    Scanner sc = new Scanner(System.in);

    int Salary;
    String Name;

    public void Id(){
        System.out.println("Enter your ID: ");
        int a = sc.nextInt();
        System.out.println("ID: "+a);
    }

    public int getsalary(){
        return Salary;
    }

    public String get_Name(){
        return Name;
    }

    public String Set_name(String a) {
        System.out.println("Enter your next name: ");
        a = sc.nextLine();
        return Name = a;
    }
}

class cellphone{
    public void ringing(){
        System.out.println("tuooooo tuooooo tuooooo tuooooo");
    }

    public void vibration(){
        System.out.println("Bzzzzzz Bzzzzzz Bzzzzzz Bzzzzzz");
    }

    public void calling(){
        System.out.println("toot toot toot toot toot toot toot");
    }
}

class tommy{
    public void Running() {
        System.out.println("Tommy is Running");
    }

    public void firing() {
        System.out.println("Tommy is Firing");
    }

    public void driving() {
        System.out.println("Tommy is Driving");
    }

    public void fighting() {
        System.out.println("Tommy is Fighting");
    }
}

class square{
    Scanner sc = new Scanner(System.in);
    public int area(int a){
        System.out.println("Enetr a side into inches: ");
        a = sc.nextInt();
        return a *= a;
    }

    public int parameter(int a){
        System.out.println("Enetr a side into inches: ");
        a = sc.nextInt();
        return a = 4*a;
    }

    public void sides(){
        System.out.println("Square have Four(4) sides");
    }
}

class circle{
    Scanner sc = new Scanner(System.in);
    public Float area(Float a){
        System.out.println("Enetr a radius of into inches: ");
        a = sc.nextFloat();
        return a = 3.14159265359f * (a*a);
    }
    
    public Float parameter(Float a){
        System.out.println("Enetr a radius of into inches: ");
        a = sc.nextFloat();
        return a = 2 * 3.14159265359f * a;
    }
    
    public void sides(){
        System.out.println("You fool Circle have no sides Circle is round just like OOOO");
    }
}

class rectangle{
    Scanner sc = new Scanner(System.in);
    public Float area(Float a){
        System.out.println("Enetr a length of into inches: ");
        a = sc.nextFloat();
        System.out.println("Enetr a width of into inches: ");
        Float w = sc.nextFloat();
        return a *= w;
    }
    
    public Float parameter(Float a){
        System.out.println("Enetr a length of into inches: ");
        a = sc.nextFloat();
        System.out.println("Enetr a width of into inches: ");
        Float w = sc.nextFloat();
        return a = 2*(a+w);
    }
    
    public void sides(){
        System.out.println("Rectangle have Four(4) sides");
    }
}
public class Eight_Assignment_Of_Java {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Employee1 cs = new Employee1();
        // cellphone cp = new cellphone();
        // tommy vc = new tommy();
        square sq = new square();
        circle ci = new circle();
        rectangle re = new rectangle();

        // cs.Name = "Muhammad Haseeb Khalid";
        // System.out.println(cs.Name);
        // cs.Set_name(null);
        // System.out.println(cs.Name);
        // cs.Salary = 500000000;
        // System.out.println(cs.getsalary());
        
        // System.out.println("");
        
        // cp.ringing();
        // cp.calling();
        // cp.vibration();

        // System.out.println("");
        
        // vc.Running();
        // vc.driving();
        // vc.firing();
        // vc.fighting();

        // System.out.println("");

        // sq.sides();
        // System.out.println(sq.area(0));
        // System.out.println(sq.parameter(0));

        // ci.sides();
        // System.out.println(ci.area(null));
        // System.out.println(ci.parameter(null));

        re.sides();
        System.out.println(re.area(null));
        System.out.println(re.parameter(null));
    }
}
