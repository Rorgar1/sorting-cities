package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        if (o1.getPopulation() < o2.getPopulation()) return -1;
        if (o1.getPopulation() > o2.getPopulation()) return 1;
        return 0;
    }
}

