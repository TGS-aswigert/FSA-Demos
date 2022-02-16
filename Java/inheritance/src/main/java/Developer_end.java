public class Developer_end extends Employee_end {

    private String currentProject;

    public Developer_end(String name, String email, double salary) {
        super(name, email, salary);
        this.currentProject = "on the bench";
    }

    public void code() {
        System.out.println(this.getName() + " is coding.");
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }
}
