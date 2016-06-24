package com.jiaowu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "score", catalog = "ssh")
public class Score implements java.io.Serializable {

	// Fields

	private Integer scoreid;
	private Subject subject;
	private User user;
	private Integer fenshu;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** full constructor */
	public Score(Subject subject, User user, Integer fenshu) {
		this.subject = subject;
		this.user = user;
		this.fenshu = fenshu;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "scoreid", unique = true, nullable = false)
	public Integer getScoreid() {
		return this.scoreid;
	}

	public void setScoreid(Integer scoreid) {
		this.scoreid = scoreid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subject")
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "fenshu")
	public Integer getFenshu() {
		return this.fenshu;
	}

	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}

}