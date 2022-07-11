package ifce.Educa.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_exercise")
public class Exercise {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "deadline")
	private Calendar deadline;
	
	@Column (name = "question") // Modificar tipo para upload
	private String question;
	
	@Column (name = "solution") // Modificar tipo para upload
	private String solution;
}
