package ifce.Educa.model;

import java.time.Instant;

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
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "deadline")
	private Instant deadline;

	@Column (name = "question")
	private String questionFileName;
	
	@Column (name = "solution")
	private String solutionFileName;
	
	@Column (name = "solutionExtension")
	private String extensionSolutionFile;
	
	@Column (name = "questionExtension")
	private String extensionQuestionFile;

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

	public Instant getDeadline() {
		return deadline;
	}

	public void setDeadline(Instant deadline) {
		this.deadline = deadline;
	}

	public String getQuestionFileName() {
		return questionFileName;
	}

	public void setQuestionFileName(String questionFileName) {
		this.questionFileName = questionFileName;
	}

	public String getSolutionFileName() {
		return solutionFileName;
	}

	public void setSolutionFileName(String solutionFileName) {
		this.solutionFileName = solutionFileName;
	}

	public String getExtensionSolutionFile() {
		return extensionSolutionFile;
	}

	public void setExtensionSolutionFile(String extensionSolutionFile) {
		this.extensionSolutionFile = extensionSolutionFile;
	}

	public String getExtensionQuestionFile() {
		return extensionQuestionFile;
	}

	public void setExtensionQuestionFile(String extensionQuestionFile) {
		this.extensionQuestionFile = extensionQuestionFile;
	}
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                