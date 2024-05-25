public class Third_Assignment_Of_Java {
    public static void main(String[] args) {
        
        String name = "ABDUL HASEEB";
        // Question # 01
        {
            System.out.println(name.toLowerCase());
        }
        
        // Question # 02
        {
            System.out.println(name.replace(' ','_'));
        }
        
        // Question # 03
        {
            String naam = "What is your <|naam|>";
            System.out.println(naam.replace("<|naam|>","Abdul Haseeb"));
        }
        
        // Question # 04
        {
            String mn = "My  Name  Is   Abdul   Haseeb ";
            System.out.println(mn.indexOf("  "));
            System.out.println(mn.indexOf("   "));
        }

        // Question # 05
        {
            String letter = "Dear Harry!\n\tThis java Course is nice.\n\t\t\tThanks";
            System.out.println(letter);
        }
    }
}
