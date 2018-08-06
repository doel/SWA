import geb.Page
import geb.spock.GebSpec

class SWHomePage extends Page {
	//static url = "http://www.southwest.com"
	
	static at = { title == "Southwest Airlines | Book Flights & More - Wanna Get Away?" }
	
	static content = {
		heading { $("h1").text() }
		errorHeading { $(".error-label").text() }
		airCityDepartureField{ $("#air-city-departure") }
		airCityArrivalField { $("#air-city-arrival") }

		searchButton {$("#jb-booking-form-submit-button")}
	}
}






	


