package class17;

public class Students {
    /* Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student name.
     */

    String studentName;
    int gradeHistory;
    int gradeScience;
    int gradeMath;

    Students(String studentName, int gradeHistory, int gradeScience, int gradeMath){
        this.studentName=studentName;
        this.gradeHistory=gradeHistory;
        this.gradeScience=gradeScience;
        this.gradeMath=gradeMath;

    }
    void averageGrade(){
        System.out.println(studentName+" averageGrade:"+(gradeHistory+gradeScience+gradeMath)/3);
    }

    public static void main(String[] args) {
        Students s1=new Students("Ryan", 90,98,92);
        s1.averageGrade();

        Students s2=new Students("Suzy", 95, 99, 96);
        s2.averageGrade();

        Students s3=new Students("Tony", 88, 86,90);
        s3.averageGrade();

        Students s4=new Students("Nadine", 92,87,91);
        s4.averageGrade();

        Students s5=new Students("Angela", 80,83,94);
        s5.averageGrade();
    }

}
