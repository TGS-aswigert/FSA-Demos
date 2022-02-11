public class Main_end {

    public static void printUserData(User user) {
        System.out.println(user.name + " is " + user.age + " years old");
    }

    public static void  printUserData(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

//    public static String printUserData(User user) {
//        return user.name + " is " + user.age + " years old";
//    }

    public static void main(String[] args) {
        User user = new User("Abigail", 25);

        printUserData(user);
        printUserData("Tala", 25);
    }
}