

import geb.spock.GebReportingSpec
import SWHomePage
import FlightSearchResultPage

import spock.lang.Stepwise


class FlightSearchPageIT extends GebReportingSpec{
	
	def setup()
	{
		to SWHomePage
	}
	
	def "SouthWest Flight Search Oneway"() {
 
		given: "I'm at the SWA Home Page"
		at SWHomePage
		report "SothWest Home Page" // take a report of the SW homepage
 
		when: "I search with valid details"
		oneWay.click()
		airCityDepartureField = "DAL"
		airCityArrivalField = "LGA"
		dept_date="08/21"
		
		then : "Click to search flight"
		searchButton.click()
 
		then: "I'm at the flight search page "
		waitFor(30) {
		 at FlightSearchResultPage
		 }
		 //flightPrice.click()
		
		
	}
	/*def "SouthWest Flight Search Roundway"(){
		when : "I'm at the flight search page "
		
		at FlightSearchResultPage
		
		
		then : "Click on flight fare details"
		flightPrice.click()
		
		then: "Click on Continue"
		priceContinue.click()
		
		and: "Click on continue to navigate"
		airBooingContinue.click()
	}*/
}

