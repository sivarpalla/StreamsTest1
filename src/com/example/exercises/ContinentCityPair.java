package com.example.exercises;

import java.util.Optional;

import com.example.domain.City;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class   ContinentCityPair implements Comparable<ContinentCityPair>{

	private String continent;
	private City city;
	
	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public ContinentCityPair() {
	}

	public ContinentCityPair(String continent, City city) {
		this.continent = continent;
		this.city = city;
	}

	@Override
	public String toString() {
		return "ContinentCityPair [continent=" + continent + ", city=" + city + "]";
	}

	@Override
	public int compareTo(ContinentCityPair other) {
		return this.city.getPopulation()-other.city.getPopulation();
	}

	public static void printEntry(String continent,Optional<ContinentCityPair> pair) {
		System.out.printf("%s: %s\n",continent,pair.get().getCity());
	}

}
