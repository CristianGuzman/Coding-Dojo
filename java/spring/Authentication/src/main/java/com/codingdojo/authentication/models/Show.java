package com.codingdojo.authentication.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="show")
public class Show {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idshow;
	
	@Column
	@NotBlank
	private String name;
	
	@Column
	@NotBlank
	private String network;
	
	@ManyToMany(targetEntity = User.class)
	private Set<User> users;
	
	
	@ManyToMany(targetEntity = Rating.class)
	private Set<Rating> ratings;


	/**
	 * @param idshow
	 * @param name
	 * @param network
	 * @param users
	 * @param ratings
	 */
	public Show(Long idshow, @NotBlank String name, @NotBlank String network, Set<User> users, Set<Rating> ratings) {
		super();
		this.idshow = idshow;
		this.name = name;
		this.network = network;
		this.users = users;
		this.ratings = ratings;
	}


	/**
	 * 
	 */
	public Show() {
		super();
	}


	/**
	 * @return the idshow
	 */
	public Long getIdshow() {
		return idshow;
	}


	/**
	 * @param idshow the idshow to set
	 */
	public void setIdshow(Long idshow) {
		this.idshow = idshow;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the network
	 */
	public String getNetwork() {
		return network;
	}


	/**
	 * @param network the network to set
	 */
	public void setNetwork(String network) {
		this.network = network;
	}


	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}


	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}


	/**
	 * @return the ratings
	 */
	public Set<Rating> getRatings() {
		return ratings;
	}


	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}


	@Override
	public String toString() {
		return "Show [idshow=" + idshow + ", name=" + name + ", network=" + network + ", users=" + users + ", ratings="
				+ ratings + "]";
	}
	
	

}
