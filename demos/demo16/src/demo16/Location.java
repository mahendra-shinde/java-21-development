package demo16;

public class Location {
	private int locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String state;
	private String countryId;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public Location(int locationId, String streetAddress, String postalCode, String city, String state,
			String countryId) {
		super();
		this.locationId = locationId;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.state = state;
		this.countryId = countryId;
	}
	
	public Location() {
		super();
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", streetAddress=" + streetAddress + ", postalCode=" + postalCode
				+ ", city=" + city + ", state=" + state + ", countryId=" + countryId + "]";
	}
	
	
}
