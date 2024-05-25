public class Third {
    public static void main(String[] args) {
        
        {
            int a = 10;
            System.out.format("That is the value of a = %d\n",a);
            System.out.printf("That is the value of a = %d\n",a);
            float b = 5.2312f;
            System.out.format("That is the value of a = %f\n",b);
            System.out.printf("That is the value of a = %f\n",b);
            System.out.printf("That is the value of a = %15.2f\n",b);
            char c = 'H';
            System.out.format("That is the value of a = %c\n",c);
            System.out.printf("That is the value of a = %c\n",c);
            String s = "This is Charry";
            System.out.format("That is the value of a = %s\n",s);
            System.out.printf("That is the value of a = %s\n",s);
        }

        {
            String value = "End of Time";
            int val = value.length();
            System.out.println("The length of value is "+val);
            
            String uc = value.toUpperCase();
            System.out.println("The value of uppercase is "+uc);
            
            String lc = value.toLowerCase();
            System.out.println("The value of lowercase is "+lc);
            
            String unTrimed = "         End of Time       ";
            System.out.println("The value of untrimed is "+unTrimed);
            String Trimed = unTrimed.trim();
            System.out.println("The value of trimed is "+Trimed);

            System.out.printf("This progarm is start's form seventh index of string that's T Let's check (%S)\n",value.substring(7));
            System.out.format("This progarm is start's form Second index of string that's D Let's check (%S)\n",value.substring(2));
            System.out.printf("This progarm is start's form Forth index of string that's O Let's check (%S)\n",value.substring(4));

            System.out.printf("This progarm is start's form Forth index (O) and end on Seventh index (T) of string Let's check (%S)\n",value.substring(4,8));

            String name = "Harryarrya";
            System.out.println("We replace the 'r' to 'p' from Harry So that is "+name.replace('r', 'p')+" now");

            System.out.println("We replace the 'arry' to 'eair' from Harry So that is "+name.replace("arry", "eair")+" now");

            System.out.println(name.startsWith("Par"));
            System.out.println(name.startsWith("Har"));

            System.out.println(name.endsWith("ay"));
            System.out.println(name.endsWith("rry"));

            System.out.println(name.charAt(2));

            System.out.println(name.indexOf("arry"));
            System.out.println(name.indexOf('a'));
            
            System.out.println(name.indexOf('a', 3));
            
            System.out.println(name.lastIndexOf('a'));

            System.out.println(name.lastIndexOf('a', 7));

            System.out.println(name.equals("Harryarrya"));
            System.out.println(name.equals("HarryarrYa"));

            System.out.println(name.equalsIgnoreCase("hARRYARRYA"));
            System.out.println(name.equalsIgnoreCase("hARRYARYA"));
        }

        // Escape Sequence Character
        // (1) \n is for next line
        // (2) \t is for for space
        // (3) \'
        // (4) // is for comment that is not readable for compiler or interpreter
        {
            // (1) \n use for nextline
            {
                System.out.print("this is the slash N to go in next line \n");
            }

            // (2) \n use for four space
            {
                System.out.print("this is the slash \t N to go in next line \n");
            }

            // (3) \n use for double quote and single quote
            {
                System.out.print("this is the \'slash N to\' \"go in next\" line \n");
            }

            // (4) \n use for nextline
            {
                // System.out.print("this is the slash N to go in next line \n");
            }
        }
    }
}
