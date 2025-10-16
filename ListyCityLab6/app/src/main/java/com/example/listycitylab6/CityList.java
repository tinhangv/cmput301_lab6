package com.example.listycitylab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * When given a city, return whether or not it belongs in the list
     * @param city  the city to check for if it belongs in the list
     * @return
     *      Return true if the city is in the list
     *      Return false if the city is not in the list
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Check if a city is present in the list. If it does then remove it from the list,
     * if not then **throw an exception**
     * @param city  the city to delete from the list
     */
    public void delete(City city){
        if(!cities.contains(city)) throw new IllegalArgumentException();
        cities.remove(city);
    }

    /**
     * Return how many cities are in the list
     * @return  the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }

}
