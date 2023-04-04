public class Main {
    public static void main(String[] args) {
        City cityVille = new City();
        City cityMarseille = new City("Marseille", 123456789, "France");
        City cityRio = new City("Rio", 321654, "Brésil");
        System.out.println(cityMarseille);
        System.out.println(cityRio);
        City temp = new City();
        temp = cityMarseille;
        cityMarseille = cityRio;
        cityRio = temp;
        System.out.println(cityMarseille);
        System.out.println(cityRio);
        cityMarseille.setName("Hong kong");
        cityRio.setName("Djibouti");
        System.out.println(cityMarseille);
        System.out.println(cityRio);
        cityMarseille.compare(cityRio);
        /*City ville = new City();
        System.out.println("Le nombre d'instances de la classe ville est: " + City.nbCities);
        System.out.println("Le nombre d'instances de la classe ville est: " + City.getNbCitiesDouble());
        City villeMarseille = new City("Marseille",123456789,"France");
        System.out.println("Le nombre d'instances de la classe ville est: " + City.nbCities);
        System.out.println("Le nombre d'instances de la classe ville est: " + City.getNbCitiesDouble());
        City villeRio = new City("Rio", 321654,"Brésil");
        System.out.println("Le nombre d'instances de la classe ville est: " + City.nbCities);
        System.out.println("Le nombre d'instances de la classe ville est: " + City.getNbCitiesDouble());*/
        Capital cap = new Capital();
        System.out.println(cap);
        Capital capFrance = new Capital("Paris", 654987, "France", "La tour Eiffel");
        System.out.println(capFrance);

     /*   City listOfCities[] = new City[6];
        String tabNames[] = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
        int tabHabitants[] = {123456,78456,654987,75832165,1594,213};
        for (int i=0;i<listOfCities.length;i++) {
            if (i<3) {
                City V = new City(tabNames[i], tabHabitants[i], "france");
                listOfCities[i] = V;
            }
            else {
                Capital C = new Capital(tabNames[i], tabHabitants[i], "france", "La tour Eiffel");
                listOfCities[i] = C;
            }
        }
        for(City obj : listOfCities)
            System.out.println(obj);
        }*/

    }
}
