
public abstract class Member {
	private int memberId;
	private String fullName;
	private String email;
	private String currentLocation;
	private String regDate;
	private String educationLevel;
	private String educationField;
	private String instituteName;
	private String country;
	private String experience;
	private String experienceType;
	private String[] goals;
	private String[] interests;
	private String preference;
	private String ranking;
	
	public Member(int memberId, String fullName, String email, String currentLocation, String regDate,
			String educationLevel, String educationField, String instituteName, String country, String experience,
			String experienceType, String[] goals, String[] interests, String preference, String ranking) {
		super();
		this.memberId = memberId;
		this.fullName = fullName;
		this.email = email;
		this.currentLocation = currentLocation;
		this.regDate = regDate;
		this.educationLevel = educationLevel;
		this.educationField = educationField;
		this.instituteName = instituteName;
		this.country = country;
		this.experience = experience;
		this.experienceType = experienceType;
		this.goals = goals;
		this.interests = interests;
		this.preference = preference;
		this.ranking = ranking;
	}


	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEducationField() {
		return educationField;
	}

	public void setEducationField(String educationField) {
		this.educationField = educationField;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getExperienceType() {
		return experienceType;
	}

	public void setExperienceType(String experienceType) {
		this.experienceType = experienceType;
	}

	public String[] getGoals() {
		return goals;
	}

	public void setGoals(String[] goals) {
		this.goals = goals;
	}

	public String[] getInterests() {
		return interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

}
