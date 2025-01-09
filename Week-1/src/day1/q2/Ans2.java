package day1.q2;

import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents;
        int gradeOfStudent;
        System.out.println("Enter number of students");
        numOfStudents = scanner.nextInt();
        double average = 0.0d;
        double total = 0.0d;

        int grades[] = new int[numOfStudents];
        int counter = 0;
        while(counter < numOfStudents){
            System.out.println("Enter grade for student " + (counter+1));
            gradeOfStudent = scanner.nextInt();
            if(gradeOfStudent > 100 || gradeOfStudent < 0){
                System.out.println("Invalid grades, try again");
                continue;
            }
            grades[counter++] = gradeOfStudent;
        }
        for(int grade : grades){
            total+= grade;
            System.out.println("Total Marks: "+ total);

            average=total/grades.length;

            System.out.println("Average: "+ average);
        }
    }
}
