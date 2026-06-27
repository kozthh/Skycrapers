package services;
import entity.entity;
import java.util.ArrayList;
public class GradeCalculator {

entity student;

for (Double grade : student.getStudentGrade()) {
    double sum = 0;
    for ( double g: student.getStudentGrade()) {
        sum += g;
    }
    double average = sum / student.getStudentGrade().size();
    System.out.println("Average Grade: " + average);

}
}