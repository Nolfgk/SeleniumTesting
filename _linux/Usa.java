package com.lessons.task1;

public class Usa extends Country {


    private static int percent;
    private static int correction = 3;

    public static int getCorrection() {
        return correction;
    }

    public int countMen(){
        Country usa = new Country("Trump", 200,110,90);

        int mensPercent = (usa.getMen()*100)/usa.getPopulation();
        percent = mensPercent + correction;
        return percent;
    }

}
