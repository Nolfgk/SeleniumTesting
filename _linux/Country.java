package com.lessons.task1;


public class Country {
    private String president;
    private int population, men, women;

    public Country() {}

    public Country(String president, int population, int men, int women) {
        this.president = president;
        this.population = population;
        this.men = men;
        this.women = women;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getMen() {
        return men;
    }

    public void setMen(int men) {
        this.men = men;
    }

    public int getWomen() {
        return women;
    }

    public void setWomen(int women) {
        this.women = women;
    }

    public int countMen(){
        System.out.println(men);
        return men;
    }



}
