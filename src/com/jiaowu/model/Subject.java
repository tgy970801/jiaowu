package com.jiaowu.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Subject entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "subject", catalog = "ssh")
public class Subject implements java.io.Serializable {

	// Fields

	private Integer subjectid;
	private String kemu;
	private String teacher;
	private Set<Score> scores = new HashSet<Score>(0);

	// Constructors

	/** default constructor */
	public Subject() {
	}

	/** full constructor */
	public Subject(String kemu, String teacher, Set<Score> scores) {
		this.kemu = kemu;
		this.teacher = teacher;
		this.scores = scores;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "subjectid", unique = true, nullable = false)
	public Integer getSubjectid() {
		return this.subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

	@Column(name = "kemu", length = 32)
	public String getKemu() {
		return this.kemu;
	}

	public void setKemu(String kemu) {
		this.kemu = kemu;
	}

	@Column(name = "teacher", length = 32)
	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<Score> getScores() {
		return this.scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

}