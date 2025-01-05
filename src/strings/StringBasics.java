package strings;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Ram";   //using string literal
        String sameName = "Ram";
        String newName = new String("Ram");   //using new keyword

        System.out.println(name);
        System.out.println(newName);

        System.out.println(name == sameName);
        System.out.println(name == newName);   // false since we are comparing the references
        System.out.println(name.equals(sameName));  // true, compares actual values
        System.out.println(name.equals(newName));

        String s = "RAM";
        System.out.println(name.equalsIgnoreCase(s));  // true, ignores case
    }
}
