import geb.Page

class FlightSearchResultPage  extends Page{
	
	//static url = "/air/booking"
	
	static at = { title == "Southwest Airlines - Select Flights" }
	static content= {
			flightPrice { $("#air-booking-fares-0-1 .fare-button fare-button_primary-blue select-detail--fare button") }
			priceContinue { $("#air-booking-fare-drawer-1-0 button .actionable--text") }
			airBooingContinue { $("#air-booking-product-1") }
	}
	
	void clickToPrice() {
		flightPrice.click()
	}
}
