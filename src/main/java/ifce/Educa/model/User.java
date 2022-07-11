package ifce.Educa.model;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tb_user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "name")
	private String name;

	@Column(name = "email", unique = true)
	private String  email;
	
	@Column(name = "password")
	private String password;
	
	@ManyToMany
	private Collection<Classroom> classroom = new ArrayList<Classroom>();
	
	@Column (name = "user_type")
	private String role;

	private void addTeacher() {
		this.role = "TEACHER";
	}
	
	private void addStudent() {
		this.role = "STUDENT";
	}

	public User() {
		
	}
	
	public User(String name, String email, String password, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		
		if(role == "teacher") {
			this.addTeacher();
		} else if(role == "student") {
			this.addStudent();
		}
	}
	
	public String getRole() {
		return role;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<Classroom> getClassroom() {
		return classroom;
	}

	public void setClassroom(Collection<Classroom> classroom) {
		this.classroom = classroom;
	}

}

