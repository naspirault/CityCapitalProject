import java.util.Objects;

public class City {
    //Variable publique qui compte les instances de ville
    public static int nbCities = 0 ;
    //Variable privée qui compte aussi les instances de ville
    protected static int nbCitiesDouble = 0;
    protected  String name;
    protected int  inhabitants;
    protected String country;
    protected char category;

    public City() {
        System.out.println("Création d'une ville !");
        this.name = "Inconnu";
        this.country = "Inconnu";
        this.inhabitants = 0;
        this.setCategory();
        nbCities++;
        nbCitiesDouble++;
    }
    public City(String name, int inhabitants, String country) {
        System.out.println("Création d'une ville avec des paramètres !");
        this.name = name;
        this.country = country;
        this.inhabitants = inhabitants;
        this.setCategory();
        nbCities++;
        nbCitiesDouble++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getInhabitants() {
        return inhabitants;
    }
    public char getCategory() {
        return category;
    }
    public static int getNbCitiesDouble() {
        return nbCitiesDouble;
    }
    public void setCategory() {
        int upperLimits [] = {0,1000,10000,100000,500000,1000000,5000000,10000000};
        char categories[]={'?','A','B','C','D','E','F','G','H'};
        int i=0;
        while ((i<upperLimits.length) && (this.inhabitants > upperLimits[i]))
            i++;
        this.category = categories[i];
    }
    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
        this.setCategory();
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String compare(City city1){
        String str = new String();

        if (city1.getInhabitants() > this.inhabitants)
            str = city1.getName()+ " est une ville plus peuplée que "+this.name;
        else
            str = this.name+" est une ville plus peuplée que "+city1.getName();
        return  str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return getInhabitants() == city.getInhabitants()
                && getCategory() == city.getCategory()
                && Objects.equals(getName(), city.getName())
                && Objects.equals(getCountry(), city.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getInhabitants(), getCountry(), getCategory());
    }

    @Override
    public String toString() {
        return "City{" +
                getName() + " est une ville de " +
                getCountry() + ", elle comporte : " + getInhabitants() +
                " habitant(s) => elle est donc de catégorie : " + getCategory();
    }
}
