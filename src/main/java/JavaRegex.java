public class JavaRegex {
    public static void main(String[] args) {
        System.out.println("Java Regex (Regular Expression)");

        String name = "Bayu Rahman Adinata";

        boolean condition1 = name.matches("Bayu Rahman Adinata");
        boolean condition2 = name.matches("Bayu Rahman ");

        System.out.println("Condition 1 : " + condition1);
        System.out.println("Condition 2 : " + condition2);
    }
}
