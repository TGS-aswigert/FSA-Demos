public class BackendDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava(){
        System.out.println("writing Java");
    }

}