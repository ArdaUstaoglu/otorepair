package ibmtal.otorepair.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ibmtal.otorepair.business.service.ServicePartService;
import ibmtal.otorepair.core.result.Result;

@Entity
@Table(name="serviceParts")
public class ServicePart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@ManyToOne
	@JoinColumn(name="serviceCard")
	private ServiceCard serviceCard;
	@Column(name="otoPartName")
	private String otoPartName;
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private double price;
	public ServicePart() {
		super();
	}
	public ServicePart(int id, ServiceCard serviceCard, String otoPartName, int quantity, double price) {
		super();
		this.id = id;
		this.serviceCard = serviceCard;
		this.otoPartName = otoPartName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ServiceCard getServiceCard() {
		return serviceCard;
	}
	public void setServiceCard(ServiceCard serviceCard) {
		this.serviceCard = serviceCard;
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
	public Result<ServicePart> getAll() {
		return null;
	}
	public Result<ServicePart> servicePart(ServicePartService servicePartService) {
		return null;
	}
	

}
