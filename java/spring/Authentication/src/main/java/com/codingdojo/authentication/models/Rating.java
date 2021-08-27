package com.codingdojo.authentication.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="rating")
public class Rating {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idrating;
	
	@Column
	@NotBlank
	private Float valor;

	/**
	 * @param idrating
	 * @param valor
	 */
	public Rating(Long idrating, @NotBlank Float valor) {
		super();
		this.idrating = idrating;
		this.valor = valor;
	}

	/**
	 * 
	 */
	public Rating() {
		super();
	}

	/**
	 * @return the idrating
	 */
	public Long getIdrating() {
		return idrating;
	}

	/**
	 * @param idrating the idrating to set
	 */
	public void setIdrating(Long idrating) {
		this.idrating = idrating;
	}

	/**
	 * @return the valor
	 */
	public Float getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Rating [idrating=" + idrating + ", valor=" + valor + "]";
	}
	
	
	

}
