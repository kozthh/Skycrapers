package entity;
import arraylist;
class entity { 

private String Student name; 
private int Student ID;
private ArrayList<Double> Student grade;


public entity(String studentName, int studentID, ArrayList<Double> studentGrade) {
    this.Student name = studentName;
    this.Student ID = studentID;
    this.Student grade = studentGrade;
}

public String getStudentName() {
    return Student name;
}

public void setStudentName(String studentName) {
    this.Student name = studentName;
}

public int getStudentID() {
    return Student ID;
}

public void setStudentID(int studentID) {
    this.Student ID = studentID;
}

public ArrayList<Double> getStudentGrade() {
    return Student grade;
}

public void setStudentGrade(ArrayList<Double> studentGrade) {
    this.Student grade = studentGrade;
}

}