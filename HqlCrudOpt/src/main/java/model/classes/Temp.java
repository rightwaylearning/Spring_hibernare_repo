package model.classes;

public class Temp {

	private Integer pId;
	private String pName;
	private Double pPrice;
	private String pType;
	private String pBrand;
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpPrice() {
		return pPrice;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
	@Override
	public String toString() {
		return "Temp [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pType=" + pType + ", pBrand="
				+ pBrand + "]";
	}
	
	
}
