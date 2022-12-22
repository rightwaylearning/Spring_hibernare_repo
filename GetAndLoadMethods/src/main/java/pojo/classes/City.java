package pojo.classes;

public class City {


	private Integer cityCode;
	private String cityName;
	private String cityState;
	private Integer cityPin;
	
	@Override
	public String toString() {
		return "City [cityCode=" + cityCode + ", cityName=" + cityName + ", cityState=" + cityState + ", cityPin="
				+ cityPin + "]";
	}

	public City() {}

	public Integer getCityCode() {
		return cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityState() {
		return cityState;
	}

	public void setCityState(String cityState) {
		this.cityState = cityState;
	}

	public Integer getCityPin() {
		return cityPin;
	}

	public void setCityPin(Integer cityPin) {
		this.cityPin = cityPin;
	}
	
	
}
