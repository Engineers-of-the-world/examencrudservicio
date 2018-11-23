package com.malu.modell;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_servicio")

public class TipoServicio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tipo_servicio")
	long id;
	
	@Column(name = "name_servicio")
	String nameServicio;

	public TipoServicio() {
		super();
		
	}

	public TipoServicio(long id, String nameServicio) {
		super();
		this.id = id;
		this.nameServicio = nameServicio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameServicio() {
		return nameServicio;
	}

	public void setNameServicio(String nameServicio) {
		this.nameServicio = nameServicio;
	}
	
	

}
