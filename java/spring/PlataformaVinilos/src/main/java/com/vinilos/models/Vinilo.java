package com.vinilos.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vinilo")
public class Vinilo {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVinilo;
	private String artista;
	private String albun;
	private Integer año;
	private boolean reedicion;
	private String edicion;
	private String caratula;
	private Integer valorventa;
	private Integer valorcompra;
	private Integer cantidad;
	private Date createdAt;
    private Date updatedAt;
    
    public Vinilo() {
    	
    }

	/**
	 * @return the idVinilo
	 */
	public Long getIdVinilo() {
		return idVinilo;
	}

	/**
	 * @param idVinilo the idVinilo to set
	 */
	public void setIdVinilo(Long idVinilo) {
		this.idVinilo = idVinilo;
	}

	/**
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * @param artista the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * @return the albun
	 */
	public String getAlbun() {
		return albun;
	}

	/**
	 * @param albun the albun to set
	 */
	public void setAlbun(String albun) {
		this.albun = albun;
	}

	/**
	 * @return the año
	 */
	public Integer getAño() {
		return año;
	}

	/**
	 * @param año the año to set
	 */
	public void setAño(Integer año) {
		this.año = año;
	}

	/**
	 * @return the reedicion
	 */
	public boolean isReedicion() {
		return reedicion;
	}

	/**
	 * @param reedicion the reedicion to set
	 */
	public void setReedicion(boolean reedicion) {
		this.reedicion = reedicion;
	}

	/**
	 * @return the edicion
	 */
	public String getEdicion() {
		return edicion;
	}

	/**
	 * @param edicion the edicion to set
	 */
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	/**
	 * @return the caratula
	 */
	public String getCaratula() {
		return caratula;
	}

	/**
	 * @param caratula the caratula to set
	 */
	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	/**
	 * @return the valorventa
	 */
	public Integer getValorventa() {
		return valorventa;
	}

	/**
	 * @param valorventa the valorventa to set
	 */
	public void setValorventa(Integer valorventa) {
		this.valorventa = valorventa;
	}

	/**
	 * @return the valorcompra
	 */
	public Integer getValorcompra() {
		return valorcompra;
	}

	/**
	 * @param valorcompra the valorcompra to set
	 */
	public void setValorcompra(Integer valorcompra) {
		this.valorcompra = valorcompra;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
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
