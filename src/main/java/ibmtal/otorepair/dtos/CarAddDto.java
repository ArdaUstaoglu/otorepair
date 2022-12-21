package ibmtal.otorepair.dtos;

public class CarAddDto {
	private String plaka;
	private String brand;
	private String model;
	private String color;
	public CarAddDto() {
		super();
	}
	public CarAddDto(String plaka, String brand, String model, String color) {
		super();
		this.plaka = plaka;
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
