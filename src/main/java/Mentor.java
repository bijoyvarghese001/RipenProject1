
public class Mentor {

	private String role;
	private String name;
	private String membershipNo;
	private String location;
	private String email;
	
	

	public Mentor(String role, String name, String membershipNo, String location, String email) {
		super();
		this.role = role;
		this.name = name;
		this.membershipNo = membershipNo;
		this.location = location;
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMembershipNo() {
		return membershipNo;
	}

	public void setMembershipNo(String membershipNo) {
		this.membershipNo = membershipNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
