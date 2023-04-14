package dayfive.multilevelInheritance;
//Parent class-2
public class State extends Country {

	private String stateName;
	private String Language;
	
	//getters and setters
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	
	//toString()
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", Language=" + Language + ", getCountryName()=" + getCountryName()
				+ ", getCountryCapital()=" + getCountryCapital() + "]";
	}
	
	

	
}
