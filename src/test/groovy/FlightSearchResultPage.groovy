import geb.Page

class FlightSearchResultPage  extends Page{
	
	//static url = "/air/booking"
	
	static at = { 
			
		waitFor(30){
				title == "Southwest Airlines - Select Flights" 
			}
		}
	public static content= {
			
			flightPrice { $("#air-booking-fares-0-1 div.fare-button_primary-blue button.fare-button--button") }
			
			flightPriceDetails {$(".select-detail--drawer")}
			
			priceContinue { $("#air-booking-fare-drawer-1-0 button.air-booking-jump-link span.actionable--text") }
			airBooingContinue { $("#air-booking-product-1") }
	}
	
	public void clickToPrice() {
		waitFor(30) {
			flightPrice.click()
			priceContinue.findAll{it.displayed}
			
	}
	
	}
	void clickToContinue() {
		waitFor(30){
			priceContinue.click()
		}
	}
}
