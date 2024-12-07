package Exam;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name="client_table")
public class Client
{
	@Id
	private int id;
	@Column(name="c_name",length = 50,nullable = false)
	private String name;
	@Column(name="c_gender",length = 50,nullable = false)
	private String gender;
	@Column(name="c_age",length = 50,nullable = false)
	private int age;
	@Column(name="c_location",length = 50,nullable = false)
	private String location;
	@Column(name="c_email",length = 20,unique = true)
	private String email;
	@Column(name="c_cno",length = 20,unique = true)
	private String cno;
	
	@Override
	public String toString() 
	{
		return "Client [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", location=" + location
				+ ", email=" + email + ", cno=" + cno + "]";
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	
	
}
