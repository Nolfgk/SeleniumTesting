package com.lessons.task1;

public class Russia extends Country {

    private static int percent;
    private static int correction = 2;

    public static int getCorrection() {
        return correction;
    }

    public int countMen(){
        Country russia = new Country("Putin", 100,60,40);

        int mensPercent = (russia.getMen()*100)/russia.getPopulation();
        percent = mensPercent + correction;
        return percent;
    }



}
