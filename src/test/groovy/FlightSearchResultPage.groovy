import geb.Page
class FlightSearchResultPage  extends Page{
	
	
	static at = {
		dynamicallyAdded(wait: true) { title == "Southwest Airlines - Select Flights" }
	}
}
