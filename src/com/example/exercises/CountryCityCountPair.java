package com.example.exercises;

import com.example.domain.City;
import com.example.domain.Country;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class CountryCityCountPair{
	private Country country; 
	private int count;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "CountryCityCountPair [country=" + country + ", count=" + count + "]";
	}
	public CountryCityCountPair(Country country, int count) {
		super();
		this.country = country;
		this.count = count;
	}
	public CountryCityCountPair() {
		super();
	}
	
}
