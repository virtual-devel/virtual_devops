package exercise;

import java.util.List;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

/**
 * This is a class to implement App.
 */
public final class App implements Consumer<String>, Predicate<String>,
Function<String, String> {
    private static final int DEF_NUM = 5;

    public final class App {
        var names = getNames();
        for (String name : names) {
            System.out.println(name);
        }
        var cars = List.of("skoda", "mercedes", "bmw", "volkswagen");

        App app = new App();
        cars.stream()
            .filter(app)
            .map(app)
            .forEach(app);
    }

    public static List<String> getNames() {
        var names = new LinkedList<String>();
        names.add("jack");
        names.add("tina smith");
        names.add("paul bond");
        return names;
    }
     @Override
    public void accept(final String t) {
        System.out.print(t + "\n");
    }

    // return true if you want to keep t in List, otherwise return false
    @Override
    public boolean test(final String t) {
        return t.length() >= DEF_NUM;
    }

    @Override
    public String apply(final String t) {
        return t.toUpperCase();
    }
}
