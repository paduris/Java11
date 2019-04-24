package immutable;


/**
 * Immutable classes are those whose state can't be changed after construction
 */
public final class ImmutableExample {

    private final String firstName;
    private final String lastName;

    public ImmutableExample(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
