
public class Mentor extends Member {
	private String profession;
	private String title;

	public Mentor(int memberId, String fullName, String email, String currentLocation, String regDate,
			String educationLevel, String educationField, String instituteName, String country, String experience,
			String experienceType, String[] goals, String[] interests, String preference, String ranking,
			String profession, String title) {
		super(memberId, fullName, email, currentLocation, regDate, educationLevel, educationField, instituteName,
				country, experience, experienceType, goals, interests, preference, ranking);
		this.profession = profession;
		this.title = title;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
