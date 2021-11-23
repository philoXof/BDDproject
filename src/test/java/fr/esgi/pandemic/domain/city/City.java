package fr.esgi.pandemic.domain.city;

public class City {
    private final CityName name;
    private int infectionLevel;


    public City(CityName name){
        this.name = name;
        this.infectionLevel = 0;
    }

    public void setInfectionLevel(int infectionLevel) {
        this.infectionLevel = infectionLevel;
    }

    public void infect(){
        infectionLevel++;
    }

    public int getInfectionLevel() {
        return infectionLevel;
    }

}
