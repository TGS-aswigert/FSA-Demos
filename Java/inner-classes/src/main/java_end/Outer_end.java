public class Outer_end {
    void outerMethod() {
        class Inner {
            void innerMethod() {
                System.out.println("This is called from the Inner class");
            }
        }
        Inner innerObject = new Inner();
        innerObject.innerMethod();
    }

    static class Main {
        public static void main(String[] args) {
            Outer_end outerObject = new Outer_end();
            outerObject.outerMethod();

            Outer_end anonOuter = new Outer_end() {
                void outerMethod() {
                    System.out.println("This is called from the anonymous inner class");
                }
            };

            anonOuter.outerMethod();
        }
    }
}

