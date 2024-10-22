import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /*
        * 1.Write a program that checks the role of the user
        * */

        System.out.print("Please enter your role : ");
        String role = input.nextLine();

        if(role.equalsIgnoreCase("admin"))
            System.out.println("welcome admin");

        else if (role.equalsIgnoreCase("superuser"))
            System.out.println("welcome superuser");

        else if  (role.equalsIgnoreCase("user"))
            System.out.println("welcome user");
        else
            System.out.println("welcome guest");
//

        /*
        * 2.Take three numbers from the user and print the greatest number.
        * */

//            System.out.print("Please enter the first number: ");
//            int number1 = input.nextInt();
//
//            System.out.print("Please enter the second number: ");
//            int number2 = input.nextInt();
//
//            System.out.print("Please enter the third number: ");
//            int number3 = input.nextInt();
//
//            if(number1 > number2 && number1 > number3 )
//                    System.out.println("the greatest number is first number = " + number1 );
//            else if (number2 > number1 && number2 > number3 )
//                System.out.println("the greatest number is second number = "+ number2);
//            else
//                System.out.println("the greatest number is third number = "+ number3);

        /*
        * 3.Write a Java program that generates an integer between 1 and 7
            and displays the name of the weekday */

//        Random rand = new Random();
//        int number = rand.nextInt(1,7);
//
//
//        switch (number) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("None");
//                break;
//
//        }

        /*
        * 4. Write a program that takes a numeric score as input and prints
             the corresponding letter grade using the following grading scale: */

//        System.out.print("Please enter numeric score: ");
//        int score = input.nextInt();
//        if(score>=90 && score <= 100 )
//            System.out.println("A");
//        else if (score >=80 && score <= 89)
//            System.out.println("B");
//        else if (score >=70 && score <= 79)
//            System.out.println("C");
//        else if (score >=60 && score <= 69)
//            System.out.println("D");
//        else
//            System.out.println("F");
//

        /*
        * 5. Write a Java program that takes a person's age as input and
            categorizes them into one of three age categories: "Child,"
            "Teenager," or "Adult" using an if statement.*/

//        System.out.print("Please enter your age: ");
//        int age = input.nextInt();
//
//        if(age >= 20 )
//            System.out.println("You are an Adult");
//        else if (age>= 13 && age < 20 )
//            System.out.println("You are a Teenager");
//        else if (age <= 13)
//            System.out.println("You are a Child");
//


    }
    }
