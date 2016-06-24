package com.jiaowu.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "ssh")
public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String password;
	private String name;
	private String shenfeng;
	private Set<Score> scores = new HashSet<Score>(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer userid) {
		this.userid = userid;
	}

	/** full constructor */
	public User(Integer userid, String password, String name, String shenfeng,
			Set<Score> scores) {
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.shenfeng = shenfeng;
		this.scores = scores;
	}

	// Property accessors
	@Id
	@Column(name = "userid", unique = true, nullable = false)
	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Column(name = "password", length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "shenfeng", length = 32)
	public String getShenfeng() {
		return this.shenfeng;
	}

	public void setShenfeng(String shenfeng) {
		this.shenfeng = shenfeng;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Score> getScores() {
		return this.scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

}