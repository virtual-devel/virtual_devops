package exercise;

/**
 * Exercise.
 */
public final class App {

    public static void main(final String[] args) {

        var names = getNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static List<String> getNames() {
        var names = new LinkedList<String>();
        names.add("jack");
        names.add("tina smith");
        names.add("paul bond");
        return names;
    }
}
