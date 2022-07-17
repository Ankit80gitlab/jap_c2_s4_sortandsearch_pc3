/*String[] citiesFromZurich ={"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
int[] distanceFromZurich = {138,52,118,136,85,276,103,87,214,101};
*/
package com.jap.linearsearch;



public class LinearSearch {
    // Calculates total number of comparisons made while searching a number in an array
    // using linear search algorithm
    static int totalComparisons = 0;

	
    
	

    //This function returns the name of the city that is at a given distance from Zurich.
    //If the city is not found a message is returned instead of the name of the city

    public String findCity(int[] distances,String[] cities, int distanceToSearch)
    {
		for (int i=0; i<distances.length; i++)
		{
			totalComparisons++;
			if (distanceToSearch==distances[i])
			return cities[i];
		}

		
			return "not found";
		
    }
    public String[] findCityAtDistanceGreaterThan270(int[] distances,String[] cities, int distanceToSearch)
    {

		int c=0;
		for (int i=0; i<distances.length; i++)
		{
			if (distances[i]>=distanceToSearch)
			c++;
		}

		String cityGreaterDistance[] =new String[c];

		for (int i=0; i<cities.length; i++)
		{
			totalComparisons++;
			if (distances[i]>=distanceToSearch)
			{
				cityGreaterDistance[c-1]=cities[i];
				c++;
			}
		}

           return cityGreaterDistance;

    }
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        // Declare the array for cities
        String[] citiesFromZurich = null;
        //Declare the array with distance from Zurich
        int[] distanceFromZurich = null;
        // call the method 'findCity'
         int variable=0;
   
		System.out.println(linearSearch.findCity(distanceFromZurich,citiesFromZurich,0));

		String [] cityName=linearSearch.findCityAtDistanceGreaterThan270(distanceFromZurich,citiesFromZurich,0);

		for (String i:cityName)
		{
			System.out.print(" "+i);
		}



        // print the city name that is equal to the distanceToSearch
		//System.out.println(findCity);

        // print the number of comparisons within the array until the city is found
	
        // call the method 'findCityAtDistanceGreaterThan270'

        // print all cities that are greater than 270 kms away from Zurich


    }
}
