import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Person {
    // Variables
    private String name;
    private int age;
    private ArrayList<String> adventureArrayList;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.adventureArrayList = new ArrayList<>();
    }

    // Functions
    public void addAdventure(String course) {
        this.adventureArrayList.add(course);
    }

    public ArrayList<String> getAdventure() {
        return this.adventureArrayList;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<Person> Person = new ArrayList<Person>();
        Scanner myObj = new Scanner(System.in);
        String person;

        for (int i = 0; i < 5; i++) {
            // Ask Student's Name and Age
            System.out.println("\nEnter Your name: ");
            person = myObj.nextLine();

            System.out.println("Enter Your age: ");
            int age = myObj.nextInt();
            myObj.nextLine();

            Person p = new Person(person, age);

            // Add Adventure to the list 
            List<String> adventureList = new ArrayList<>();
            adventureList.add("Rock climbing");
            adventureList.add("Skydiving");
            adventureList.add("Whitewater rafting");
            adventureList.add("Scuba diving");
            adventureList.add("Hiking and camping");
            adventureList.add("Bungee jumping");
            adventureList.add("Surfing");
            adventureList.add("Zip-lining");
            adventureList.add("Snowboarding");
            adventureList.add("Mountain Biking");
            
            //Select 5 sujects randomly out of the list above
            Random random = new Random();
            for (int j = 0; j < 2; j++) {
                int randomIndex = random.nextInt(adventureList.size());
                String randomAdventure = adventureList.get(randomIndex);
                p.addAdventure(randomAdventure);
            }
            // Add a person to list
            Person.add(p);

            // Loop through a person
            for (Person s : Person) {
                // Expressions
                int ageInDays = s.getAge() * 365;

                // Conditionals
                if (s.getAge() < 18) {
                    System.out.println("\n"+s.getName() + " is a minor.");
                   // Function call
                    printAgeInDays(s.getName(), ageInDays);
                    System.out.println("\nNote:No person under the age of 18 or 6570 days shall engage in any of these activities \nwithout the supervision and consent of their parent or legal guardian.\n");
                } else {
                    System.out.println(s.getName() + " is an adult.");
                    // Function call
                    printAgeInDays(s.getName(), ageInDays);
                }

                // Print adventureArrayList
                System.out.println(s.getName() +",these are some adventure ideas for you:");
                for (String course : s.getAdventure()) {
                    System.out.println("- " + course);
                }

                
                
            }
        }
    }

    public static void printAgeInDays(String name, int days) {
        System.out.println(name + " is " + days + " days old.");
    }
}