import geb.spock.GebReportingSpec
import spock.lang.Stepwise


class FlightSearchPageIT extends GebReportingSpec{
	def "Flight Search Test Happy Path"() {
 
		given: "I'm at the SWA Home Page"
		to SWHomePage
 
		when: "I search with valid details"
		airCityDepartureField = "DAL"
		airCityArrivalField = "LGA"
		
		searchButton.click()
 
		then: "I'm at the flight search page "
		at FlightSearchResultPage
 
	}
}

