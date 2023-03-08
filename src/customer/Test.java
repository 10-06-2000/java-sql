package customer;

public class Test {
	private int RegId;
	public int getRegId() {
		return RegId;
	}
	public void setRegId(int regId) {
		RegId = regId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	private String name;
	private int phonenumber;
	private String EmailID;
	private String Location;
	public Test(int regId, String name, int phonenumber, String emailID, String location) {
		super();
		RegId = regId;
		this.name = name;
		this.phonenumber = phonenumber;
		EmailID = emailID;
		Location = location;
		
	}
	@Override
	public String toString() {
		return "Test [RegId=" + RegId + ", name=" + name + ", phonenumber=" + phonenumber + ", EmailID=" + EmailID
				+ ", Location=" + Location + "]";
	}

	
		

	}


