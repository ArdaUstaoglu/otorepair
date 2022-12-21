package ibmtal.otorepair.dtos;

public class ServiceCardAddDto {
	private String otoPartName;
	private int quantity;
	private double price;
	public ServiceCardAddDto() {
		super();
	}
	public ServiceCardAddDto(String otoPartName, int quantity, double price) {
		super();
		this.otoPartName = otoPartName;
		this.quantity = quantity;
		this.price = price;
	}
	public String getOtoPartName() {
		return otoPartName;
	}
	public void setOtoPartName(String otoPartName) {
		this.otoPartName = otoPartName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
