package immutable;

import java.util.ArrayList;

public final class Country {

    private final ArrayList<String> listOfStates;
    private final String countryName;

    public Country(ArrayList<String> listOfStates, String countryName) {
        this.listOfStates = listOfStates;
        this.countryName = countryName;
    }

    public ArrayList<String> getListOfStates() {
        return (ArrayList<String>) listOfStates.clone();
    }

    public String getCountryName() {
        return countryName;
    }
}
