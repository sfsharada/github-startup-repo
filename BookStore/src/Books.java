
public class Books {

	private String firstName;
	private String lastName;
	private String city;
	private String titile;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	@Override
	public String toString() {
		return "Books [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", titile=" + titile
				+ "]";
	}

}
