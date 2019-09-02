package com.herokuapp.mohitdtumce.commons.entities;

import com.herokuapp.mohitdtumce.commons.constants.Constants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Constants.USER_CREDENTIALS_TABLE)
public class UserCredentials {

	@Id
	@Column(name = "user", nullable = false)
	private String user;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "passwd", nullable = false)
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}