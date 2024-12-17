import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {      
    Scanner input = new Scanner(System.in);
            
    System.out.println("Name: ");
    String theName = input.nextLine();

    System.out.println("Age: ");
    int theAge = input.nextInt();

    System.out.println("Funds: ");
    int theFunds = input.nextInt();
    
    System.out.println("Casino name: ");
    String casinoName = input.nextLine();

    input.nextLine();

    System.out.println("Casino funds: ");
    int casinoFunds = input.nextInt();
    
    
    class Raccoon
        {
            private String name;
            private int age;
            private int funds;


            public Raccoon(String theName, int theAge, int theFunds)
            {
                name = theName;
                age = theAge;
                funds = theFunds;
            }

            public String toString()
            {
                String res = "Racoon called " + name + " is " + age + " years old and has " + funds + " shillings to his name";
                return res;
            }
        }

        class Casino
        {
            private String cname;
            private int wealth;

            public Casino(String casinoName, int casinoFunds) 
            {
                cname = casinoName;
                wealth = casinoFunds;
            }

            public String toString() 
            {
                String res = "Casino " + cname + " has " + wealth + " shillings at their disposal";
                return res;
            }
        }
    Raccoon example = new Raccoon(theName, theAge, theFunds);

    System.out.println(example);

    Casino beans = new Casino(casinoName, casinoFunds);

    System.out.println(beans);
    }
}
