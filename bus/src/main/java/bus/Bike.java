package bus;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	private int id;
	private String name;
	private long ph;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	

}
