package Lab2;

public class Province {

    private String name;
    private String capital;
    private int populationMillions;

    private final static String DEFAULT_PROVINCE = "British Columbia" ;
    private final static String DEFAULT_CAPITAL = "Victoria";
    private final static int DEFAULT_POPULATION_MILLIONS = 4;

    private String[] capitalArray = { "Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg", "Regina", "Halifax",
            "Fredericton", "St. John's", "Charlottetown" };

    private String[] provincesArray = { "Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan",
            "Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island" };

    public Province(String name, String capital, int populationMillions)
    {
        if ((isValidPopulation(populationMillions)) && (isValidProvince(name)) && (isValidCapitalCity(capital))) {
            this.name = name;
            this.capital = capital;
            this.populationMillions = populationMillions;
        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationMillions = DEFAULT_POPULATION_MILLIONS; }}

    public Province() {
        this.name = DEFAULT_PROVINCE;
        this.capital = DEFAULT_CAPITAL;
        this.populationMillions = DEFAULT_POPULATION_MILLIONS; }

    private boolean isValidProvince(String name) {
        for (String aProvincesArray : provincesArray) {
            if (aProvincesArray.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital) {

        for (String aCapitalArray : capitalArray) {
            if (aCapitalArray.equals(capital)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPopulation(int populationMillions) {
        if(populationMillions>=4 && populationMillions<=38) {
            return true;
        }
        return false;
    }

    public int getPopulationMillions() {
        return populationMillions;
    }

    public String getCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulationMillions(int populationMillions) {
        this.populationMillions = populationMillions;
    }

    public String getDetails() {
        return "The capital of " + this.name  +" (pop. "+this.populationMillions +" million) is "+ this.capital+ ".";
    }
}
