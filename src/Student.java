/**
 * Created by NicholasTurner on 11/15/16.
 */

import java.util.*; //CMD+B to get info from scanner file
public class Student {
    public static void main(String[] args) {
        //Luis Code
        String studentName;
        int age;
        String reason;
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        //Wishful thinking
        studentName = askStudentForHerName(input);
        age = askStudentForHerAge(input);
        reason = askStudentForAReason(input);

        System.out.println("Student name is " + studentName);
        System.out.println("Student age is " + age + " years old");
        System.out.println("Student wants to learn code because " + reason);

        input.close(); //close scanners when you're not using it because it uses memory
    }

    public static int askStudentForHerAge(Scanner input) {
        try {
            System.out.println("What's your age?");
            int age = input.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Invalid Age.  Age must be positive integer number");
            }
            return age;
        } catch (InputMismatchException e) {
            input.next();
            System.out.println("Invalid Age.  Age must be an integer number");
            return askStudentForHerAge(input);
        } catch (IllegalArgumentException e) {
            //input.next();
            System.out.println(e.getMessage());
            return askStudentForHerAge(input);
        }
    }

    public static String askStudentForHerName(Scanner input) {
        try {
            System.out.println("What's your name?");
            String studentName = input.next();
            if (studentName.trim().isEmpty()) {
                throw new IllegalArgumentException("You must enter a name");
            }
            return studentName;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askStudentForHerName(input);
        }
    }

    public static String askStudentForAReason(Scanner input) {
        try {
            System.out.println("Why do you want to be here?");
            String reason = input.next();
            if (reason.trim().isEmpty()) {
                throw new IllegalArgumentException("You must enter a reason");
            }
            return reason;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askStudentForAReason(input);
        }
    }
}


/*  My Code, pre exercise change on 11/16
    public static void main(String[] args) {
        String name = "Nick Turner";
        String inputName;
        int age = 28;
        String course = "Full Stack Web Development";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name");
        inputName = input.next();
        if (inputName = name)
            System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course + ".");
    } else {
        System.out.println("No Student with that name");
        }
        }*/