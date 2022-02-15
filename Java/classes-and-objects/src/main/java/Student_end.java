public class Student_end {
    public final String name;
    public final String agileTeam;
    private float gradePointAverage;

    public Student_end(String name, String agileTeam) {
        this.name = name;
        this.agileTeam = agileTeam;
        this.gradePointAverage = 0;
    }

    public float getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(float gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }
}
