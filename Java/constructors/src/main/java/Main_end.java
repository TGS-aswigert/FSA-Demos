public class Main_end {
    public static void main(String[] args) throws Exception {
        Dog_end anastasia = new Dog_end("Mutt", 1, "Brown");

        anastasia.setAge(9);
//        anastasia.setColor("Brown");
//        anastasia.setBreed("Mutt");

//        anastasia.setAge(54654);
//        anastasia.setColor("Hello");
//        anastasia.setBreed("Orange");

        System.out.println("My dog is a " + anastasia.getAge() + " year old "
                + anastasia.getColor() + " " + anastasia.getBreed());
    }
}
