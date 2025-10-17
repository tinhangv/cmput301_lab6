package com.example.listycitylab6;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructor for the City class
     * @param city  the name of the city
     * @param province  the name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Get the name of the city
     * @return  the name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Get the name of the province
     * @return  the name of the province
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares the name of the cities lexicographically. If the city names
     * are equal then compare the province names lexicographically.
     * @param c the City to be compared to.
     * @return a negative integer if this City is lexicographically less than c,
     * a positive integer if this City is lexicographically greater than c, or 0 if they are equal.
     */
    @Override
    public int compareTo(City c) {
        //City city = (City) o;
        int compareResult = this.city.compareTo(c.getCityName()); // this.city refers to the city name
        if(compareResult == 0){
            compareResult = this.province.compareTo(c.getProvinceName());
        }
        return compareResult;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two City objects are equal if they have the same city name and province name.
     * @param o the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City cityObj = (City) o;
        return this.city.equals(cityObj.city) && this.province.equals(cityObj.province);
    }

    /**
     * Returns a hash code value for the object using the sum of
     * the hashcode of the city string and the hashcode of the province string.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode(){
        return Objects.hash(city, province);
    }


}
