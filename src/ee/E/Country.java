package ee.E;

import java.util.ArrayList;
import java.util.List;

public class Country {




    String country;
    int population;
    ArrayList<String> spokenLanguages;


    Country(String country, int population, ArrayList<String> spokenLanguages) {

        this.country = country;
        this.population = population;
        this.spokenLanguages = spokenLanguages;

    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPop() {
        return population;
    }

    public void setPop(int population) {
        this.population = population;
    }


    @Override
    public String toString() {


        String spokenStrings = new String();
        for (String s : spokenLanguages) {
            spokenStrings += s + " ";
        }

        return getCountry() + " " + getPop() + " " + spokenStrings;


    }



    //Harjutus 5 invoke:


    public static void main(String args[]) {
        Country Eesti = new Country("Eesti", 1000000, new ArrayList<String>() {{
            add("Estonian");
            add("Russian");
            add("English");
            add("Estonglish");
        }});

        System.out.println(Eesti);

    }

}


