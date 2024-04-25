import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PlanetMain {
    public static void main(String[] args) {

//        Planet p = Planet.JUPITER;
//        System.out.printf("Jupiter %s has mass %.2f and radius %.2f\n", p.name(), p.getMass(), p.getRadius());

//        for (Planet pp : Planet.values()) {
//            System.out.printf("Planet %s has mass %.2f and radius %.2f\n", pp.name(), pp.getMass(), pp.getRadius());
//        }

        List<Planet> planets = Arrays.asList(Planet.values());
        planets.sort(Comparator.comparing(Planet::getRadius));

        for (Planet pp : planets) {
            System.out.printf("Planet %s has mass %.2f and radius %.2f\n", pp.name(), pp.getMass(), pp.getRadius());
        }
    }
}
