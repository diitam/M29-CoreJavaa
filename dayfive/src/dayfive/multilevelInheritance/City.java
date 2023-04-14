package dayfive.multilevelInheritance;

public class City extends State {

	private String cityName;
	private String area;
	
	//Getters and setters
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	//ToString() method
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getCountryName()=" + getCountryName()
				+ ", getCountryCapital()=" + getCountryCapital() + "]";
	}
	
	

}
