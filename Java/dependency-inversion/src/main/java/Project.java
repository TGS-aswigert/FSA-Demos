public class Project {
    private final BackendDeveloper backendDeveloper = new BackendDeveloper();
    private final FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    public void implement() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavaScript();
    }
}
