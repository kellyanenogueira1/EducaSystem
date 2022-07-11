package ifce.Educa.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import ifce.Educa.model.Exercise;

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
	private String contentFileName;
	
	@Column (name = "content")
	private String extensionContentFile;

	@ManyToMany
	private Collection<Exercise> ExerciseFiles = new ArrayList<Exercise>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContentFileName() {
		return contentFileName;
	}

	public void setContentFileName(String contentFileName) {
		this.contentFileName = contentFileName;
	}

	public String getExtensionContentFile() {
		return extensionContentFile;
	}

	public void setExtensionContentFile(String extensionContentFile) {
		this.extensionContentFile = extensionContentFile;
	}

	public Collection<Exercise> getExerciseFiles() {
		return ExerciseFiles;
	}

	public void setExerciseFiles(Collection<Exercise> exerciseFiles) {
		ExerciseFiles = exerciseFiles;
	}

}

