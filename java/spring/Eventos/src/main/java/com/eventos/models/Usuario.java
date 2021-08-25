package com.eventos.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Userid;
	
	private String FistName;
	
	private String LastName;
	
	@Email(message="Email must be valid")
	private String Email;
	
	private String Location;
	
	private Integer Estado;
	
	@Size(min=5, message="Password must be grater tahan 5 characters")
	private String Password;
	
	@Transient
    private String passwordConfirmation;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
	
	public Usuario(String email, String password, String passwordConfirmation) {
		super();
		Email = email;
		Password = password;
		this.passwordConfirmation = passwordConfirmation;
	}

	public Usuario() {
		
	}


	/**
	 * @return the userid
	 */
	public Long getUserid() {
		return Userid;
	}


	/**
	 * @param userid the userid to set
	 */
	public void setUserid(Long userid) {
		Userid = userid;
	}


	/**
	 * @return the fistName
	 */
	public String getFistName() {
		return FistName;
	}


	/**
	 * @param fistName the fistName to set
	 */
	public void setFistName(String fistName) {
		FistName = fistName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}


	/**
	 * @return the location
	 */
	public String getLocation() {
		return Location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		Location = location;
	}


	/**
	 * @return the estado
	 */
	public Integer getEstado() {
		return Estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Integer estado) {
		Estado = estado;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}


	/**
	 * @return the passwordConfirmation
	 */
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}


	/**
	 * @param passwordConfirmation the passwordConfirmation to set
	 */
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}


	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}


	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	/**
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}


	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	

}
