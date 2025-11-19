/**
 * Represents a cow with a name, age, and weight.
 */
public class Cow {
    String name;
    int age;
    double weight;

    /**
     * Creates a new Cow with the given name, age, and weight.
     *
     * @param name   the cow's name
     * @param age    the cow's age
     * @param weight the cow's weight
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Returns the cow's name.
     *
     * @return the name of the cow
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the cow's age.
     *
     * @return the age of the cow
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Returns the cow's weight.
     *
     * @return the weight of the cow
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Returns a string representation of the cow as:
     * "name, age - weight".
     *
     * @return a formatted string describing the cow
     */
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.weight;
    }

    /**
     * Determines whether this cow is equal to another object.
     * Two cows are equal when their name, age, and weight match.
     *
     * @param obj the object to compare with
     * @return true if the cows have the same values; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cow other = (Cow) obj;
        return this.name.equals(other.name)
            && this.age == other.age
            && this.weight == other.weight;
    }
}
