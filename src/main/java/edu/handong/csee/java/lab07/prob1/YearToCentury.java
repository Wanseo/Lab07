package edu.handong.csee.java.lab07.prob1; // This class is belong to this package

public class YearToCentury { // define the class 
	int year; // define the instance valuable

	public YearToCentury() // constructor(special method) -1 
	{
		year = 0; // define year to zero 
	}

	public YearToCentury(int year) //constructor -2 that have parameter 
	{
		this.year = year; // put parameter year to instance valuable year
	}

	public int calc_century() // define method that have return integer 
	{
		if(year % 100 == 0) // if input year % 100==0  
			year = year / 100; // calculate and put the result in year

		else //else 
		{
			year = (year / 100) + 1; //calculate and put the result in year
		}
		return year; //return the year (return the century)
	}
}

