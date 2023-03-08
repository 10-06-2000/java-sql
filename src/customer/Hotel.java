package customer;

public class Hotel {
	String name;
	int id;
	String location;

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
		
	
	
	
	public Hotel(String name, int id, String location) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
		
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", id=" + id + ", location=" + location + ",  + ]";
	}

}
