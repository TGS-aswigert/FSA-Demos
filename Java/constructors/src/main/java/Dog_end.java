public class Dog_end {
    private final String breed;
    private int age;
    private final String color;

    public Dog_end(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age >= 1 && age <= 25) {
            this.age = age;
        } else {
            throw new Exception("Age cannot be less than 1 or greater than 25");
        }
    }

    public String getColor() {
        return color;
    }

}
