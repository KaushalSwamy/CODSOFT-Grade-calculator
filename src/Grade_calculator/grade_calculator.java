package Grade_calculator;
import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);


        System.out.println("Enter Marks for English");
        int mark1 = Integer.parseInt(myObj.nextLine());
        System.out.println("marks entered for English: " + mark1);

        System.out.println("Enter Marks for Hindi");
        int mark2 = Integer.parseInt(myObj.nextLine());
        System.out.println("marks entered for English: " + mark2);

        System.out.println("Enter Marks for Marathi");
        int mark3 = Integer.parseInt(myObj.nextLine());
        System.out.println("marks entered for Marathi: " + mark3);

        System.out.println("Enter Marks for Mathematics");
        int mark4 = Integer.parseInt(myObj.nextLine());
        System.out.println("marks entered for Mathematics: " + mark4);

        System.out.println("Enter Marks for Science");
        int mark5 = Integer.parseInt(myObj.nextLine());
        System.out.println("marks entered for Science: " + mark5);


        int Sum;
        int total_subjects = 5;
        float averagePercentage;

//        total= Integer.parseInt(String.valueOf((mark1+mark2+mark3+mark4+mark5)));

        Sum = (mark1 + mark2 + mark3 + mark4 + mark5);
        System.out.println("\n\tTotal marks:" + Sum);

        averagePercentage = ((float) Sum / total_subjects);
        char grade;


        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if(averagePercentage>=50)    {
            grade =  'E';}
         else {
            grade = 'F';
        }

        System.out.println("\tAveragePercentage:"+averagePercentage);
        System.out.println("\tGrade:"+grade);


    }
}



