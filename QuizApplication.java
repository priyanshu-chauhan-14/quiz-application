import java.util.Scanner;

public class QuizApplication {

    static Scanner scanner = new Scanner(System.in);

    static String[] questions = {
        "Which keyword is used to create a class in Java?",
        "Which method is the starting point of a Java program?",
        "Which data type is used to store whole numbers?",
        "Which symbol is used to end a statement in Java?",
        "Which keyword is used to create an object?",
        "Which concept allows a class to have many forms?",
        "Which collection can store multiple objects and grow in size?",
        "Which keyword is used when a class inherits another class?",
        "Which keyword is used to handle an exception?",
        "Which company originally developed Java?"
    };

    static String[][] options = {
        {"A. class", "B. object", "C. method", "D. package"},
        {"A. start()", "B. main()", "C. run()", "D. begin()"},
        {"A. double", "B. String", "C. int", "D. boolean"},
        {"A. :", "B. .", "C. ;", "D. ,"},
        {"A. new", "B. make", "C. create", "D. object"},
        {"A. Encapsulation", "B. Polymorphism", "C. Inheritance", "D. Abstraction"},
        {"A. ArrayList", "B. int", "C. char", "D. boolean"},
        {"A. this", "B. super", "C. extends", "D. static"},
        {"A. try", "B. throw", "C. catch", "D. final"},
        {"A. Microsoft", "B. Sun Microsystems", "C. Apple", "D. IBM"}
    };

    static char[] answers = {'A', 'B', 'C', 'C', 'A', 'B', 'A', 'C', 'C', 'B'};

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("       JAVA QUIZ APPLICATION");
        System.out.println("=================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + ".");
            }
        }

        System.out.println("\n=================================");
        System.out.println("           QUIZ RESULT");
        System.out.println("=================================");
        System.out.println("Name  : " + name);
        System.out.println("Score : " + score + "/" + questions.length);

        double percentage = (score * 100.0) / questions.length;
        System.out.printf("Percentage: %.1f%%%n", percentage);

        if (percentage >= 80) {
            System.out.println("Excellent! Keep it up.");
        } else if (percentage >= 50) {
            System.out.println("Good job! Keep practicing.");
        } else {
            System.out.println("Keep practicing Java and try again.");
        }

        scanner.close();
    }
}
