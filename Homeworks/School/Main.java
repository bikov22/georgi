import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Person> students = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("1. Add new student");
        System.out.println("2. Add new professor");
        System.out.println("3. Add new rich student");
        System.out.println("4. Add points to student");
        System.out.println("5. Add points to professor");
        System.out.println("6. Add points to rich student");
        System.out.println("7. Show points");

        int inputNumber = scanner.nextInt();

        setInput(inputNumber);
    }

    private static void setInput(int input) {
        switch (input){
            case 1:
                students.add(new Student());
                break;
            case 2:
                students.add(new Professor());
                break;
            case 3:
                students.add(new RichStudent());
                break;
            case 4:
                System.out.println("Please enter number of points");
                int numbers = scanner.nextInt();

                for (Person person : students){
                    if (person.name == "Student"){
                        ((Student) person).addPoints(numbers);
                    }
                }
                break;
            case 5:
                System.out.println("Please enter number of points");
                int numbers1 = scanner.nextInt();

                for (Person person : students){
                    if (person.name == "Professor"){
                        ((Professor) person).addPoints(numbers1);
                    }
                }
                break;
            case 6:
                System.out.println("Please enter number of points");
                int numbers2 = scanner.nextInt();

                for (Person person : students){
                    if (person.name == "RichStudent"){
                        ((RichStudent) person).addPoints(numbers2);
                    }
                }
                break;
            case 7:
                StringBuilder str = new StringBuilder();
                for (Person person : students){
                    str.append(person.name + " " + person.getPoints());
                }
        }
    }
}
