package ifce.Educa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_educa_system")
public class System {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "user_type")
	private String role;
	
	@ManyToOne
	private User user;
	
	public String getRole() {
		return role;
	}
	
	private void addTeacher() {
		this.role = "TEACHER";
	}
	
	private void addStudent() {
		this.role = "STUDENT";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user, String role) {
		this.user = user;
		if(role == "teacher") {
			this.addTeacher();
		} else if(role == "student") {
			this.addStudent();
		}
	}
}
