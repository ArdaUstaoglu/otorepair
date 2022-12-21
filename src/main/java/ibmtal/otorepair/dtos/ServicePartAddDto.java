package ibmtal.otorepair.dtos;

public class ServicePartAddDto {
	private double servicedate;
	private double price;
	public ServicePartAddDto() {
		super();
	}
	public ServicePartAddDto(double servicedate, double price) {
		super();
		this.servicedate = servicedate;
		this.price = price;
	}
	public double getServicedate() {
		return servicedate;
	}
	public void setServicedate(double servicedate) {
		this.servicedate = servicedate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
