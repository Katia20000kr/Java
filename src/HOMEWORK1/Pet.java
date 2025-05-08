
package HOMEWORK1;

public class Pet {
    private final String species;
    private final String name;

    public Pet(String species, String name) {
        this.species = species.toLowerCase();
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }
}
