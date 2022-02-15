public class Main_end {
    public static void main(String[] args) {
        Student_end olga = new Student_end("Olga", "TOMKAT");
        System.out.println("Student Name: " + olga.name);
        System.out.println("Student Agile Team: " + olga.agileTeam);
        olga.setGradePointAverage(98.6f);
        System.out.println("Student GPA: " + olga.getGradePointAverage());
    }
}
