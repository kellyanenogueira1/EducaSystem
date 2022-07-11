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
@Table (name = "tb_lesson")
public class Lesson {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "date")
	private String date;


	@Column (name = "content")
	private String content; // Modificar tipo para upload

	@ManyToMany
	private Collection<Exercise> turma = new ArrayList<Exercise>();

}

