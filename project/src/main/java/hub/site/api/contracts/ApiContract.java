package hub.site.api.contracts;

/**
 * @author Sridhar Sangala
 *
 * 03-08-2017
 */
public class ApiContract {
	
	private String studentName;
	
	private int studentId;
	
	private Address address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
