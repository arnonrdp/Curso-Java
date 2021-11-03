package devdojo.maratonajava.javacore.za.classesinternas.test;


public class OuterClassesTest {
    private String name = "Midoriya";

    class Inner {
        public void printOuterClassAtrribute() {
            System.out.println(name);
        }
    }

    void print() {
        String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    static class Nested {
        private String lastName = "Izuku";
        void print() {
            System.out.println(new OuterClassesTest().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest outerClasses1 = new OuterClassesTest();
        Inner inner = outerClasses1.new Inner();
        inner.printOuterClassAtrribute();

        OuterClassesTest outerClasses2 = new OuterClassesTest();
        outerClasses2.print();

        new OuterClassesTest.Nested().print();
    }

}