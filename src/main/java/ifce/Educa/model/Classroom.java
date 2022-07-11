package ifce.Educa.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Classroom {
	@Id
	@GeneratedValue
	private Long codigo;
	
	@Column (name = "name")
	private String name;

	//@ManyToMany(mappedBy = "classroom")
	//private Collection<User> users = new ArrayList<User>();
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//public Collection<User> getUsers() {
	//	return users;
	//}

}

