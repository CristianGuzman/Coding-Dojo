package com.codingdojo.authentication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
	@Table(name="users")
	public class User {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	    @Column
	    @NotBlank
	    private String name;
	    @Email(message="Email must be valid")
	    private String email;
	    @Size(min=5, message="Password must be grater tahan 5 characters")
	    private String password;
	    @Transient
	    private String passwordConfirmation;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	    public User() {
	    }
	    
	    
	    /**
		 * @param email
		 * @param password
		 * @param passwordConfirmation
		 */
		public User(String email, String password, String passwordConfirmation) {
			super();
			this.email = email;
			this.password = password;
			this.passwordConfirmation = passwordConfirmation;
		}

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}


		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}


		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}


		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}


		/**
		 * @return the password
		 */
		public String getPassword() {
			return password;
		}


		/**
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			this.password = password;
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


	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }

}
